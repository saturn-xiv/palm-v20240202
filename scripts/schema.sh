#!/bin/bash

set -e

export PROTOBUF_ROOT=$HOME/.local
export WORKSPACE=$PWD
export PALM_PROTOCOLS=$WORKSPACE/protocols

function generate_goard() {
    cd $WORKSPACE

    echo 'generate code for goard'
    local target=$WORKSPACE/gourd
    rm -f $target/include/*.h $target/*.cc $target/*.cpp
    thrift -out $target --gen cpp:no_skeleton -r $PALM_PROTOCOLS/*.thrift

    $PROTOBUF_ROOT/bin/protoc -I $PALM_PROTOCOLS \
        -I $PROTOBUF_ROOT/include/google/protobuf \
        --cpp_out=$target --grpc_out=$target \
        --plugin=protoc-gen-grpc=$PROTOBUF_ROOT/bin/grpc_cpp_plugin \
        $PALM_PROTOCOLS/*.proto
    mv $target/*.h $target/include/
    mv $target/*.cc $target/*.cpp $target/src/
}

generate_goard

echo 'done.'
exit 0
