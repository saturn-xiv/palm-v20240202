#!/bin/bash

set -e

function build_palm() {
    echo "generate version.hpp"
    cat >gourd/include/palm/version.hpp <<EOF
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
    echo "build palm for x86_64"
    xmake f --toolchain=clang -c
    xmake

    # echo "build palm for riscv64"
    # xmake f -p cross --cross=riscv64-linux-gnu- -c
    # xmake

    # echo "build palm for arm64"
    # xmake
    # xmake f -p cross --cross=aarch64-linux-gnu- -c
}

build_palm

echo "done."
