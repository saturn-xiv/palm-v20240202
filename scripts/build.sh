#!/bin/bash

set -e

function build_palm() {
    echo "build palm for x86_64"
    xmake f --toolchain=clang -c
    xmake
    echo "build palm for riscv64"
    xmake f -p cross --cross=riscv64-linux-gnu- -c
    echo "build palm for arm64"
    xmake
    xmake f -p cross --cross=aarch64-linux-gnu- -c
}

build_palm

echo "done."
