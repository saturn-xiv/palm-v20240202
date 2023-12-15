#!/bin/bash

set -e

export PROTOBUF_ROOT=$HOME/.local
export WORKSPACE=$PWD
export PALM_PROTOCOLS=$WORKSPACE/protocols

function generate_goard() {
    cd $WORKSPACE

    echo 'generate code for goard'
    local target=$WORKSPACE/gourd
    if [ -d $target ]; then
        rm -r $target
    fi
    mkdir -p $target/include/palm $target/src
    thrift -out $target --gen cpp:no_skeleton -r $PALM_PROTOCOLS/*.thrift

    $PROTOBUF_ROOT/bin/protoc -I $PALM_PROTOCOLS \
        -I $PROTOBUF_ROOT/include/google/protobuf \
        --cpp_out=$target --grpc_out=$target \
        --plugin=protoc-gen-grpc=$PROTOBUF_ROOT/bin/grpc_cpp_plugin \
        $PALM_PROTOCOLS/*.proto
    mv $target/*.h $target/include/palm/
    mv $target/*.cc $target/*.cpp $target/src/

    cat >$target/include/palm/version.hpp <<EOF
#pragma once

#include <string>

// clang-format off
namespace palm {
inline static const std::string HOMEPAGE = "$(git remote get-url origin)";
inline static const std::string GIT_VERSION = "$(git describe --tags --always --dirty --first-parent)";
inline static const std::string BUILD_TIME = "$(date -R)";
inline static const std::string AUTHOR = "$(git config --get user.name)<$(git config --get user.email)>";
}
// clang-format on
EOF
}

generate_goard

echo 'done.'
exit 0
