#!/bin/bash

set -e

. /etc/os-release

export WORKSPACE=$PWD
export GIT_VERSION=$(git describe --tags --always --dirty --first-parent)
export PKG_NAME="palm-$VERSION_CODENAME-$GIT_VERSION"
export TARGET_DIR=$WORKSPACE/tmp/$PKG_NAME

function build_dashboard() {
    cd $WORKSPACE/$1/dashboard
    if [ ! -d node_modules ]; then
        npm install
    fi
    if [ -d dist ]; then
        rm -r dist
    fi
    npm run build

    mkdir -p $TARGET_DIR/$1
    mv dist $TARGET_DIR/$1/dashboard
}

function install_deb() {
    apt -y install libc6-dev:$1 libudev-dev:$1 libssl-dev:$1 \
        libpq5:$1 libpq-dev:$1 libmysqlclient-dev:$1 libsqlite3-dev:$1
}

function build_cargo_x86_64() {
    echo "build palm for x84-64"
    cd $WORKSPACE

    local CC=gcc
    local CXX=g++

    local PKG_CONFIG_ALL_STATIC=1

    local target="x86_64-unknown-linux-gnu"

    cargo clean
    cargo build --release --target $target
    cd target/$target/release/
    mkdir -p $TARGET_DIR/bin/x86_64/
    cp aloe fig $TARGET_DIR/bin/x86_64/
}

function build_cargo_aarch64() {
    echo "build palm for aarch64"
    cd $WORKSPACE

    local CC=aarch64-linux-gnu-gcc
    local CXX=aarch64-linux-gnu-g++
    local HOST_CC=gcc

    local PKG_CONFIG_ALLOW_CROSS=1
    local PKG_CONFIG_ALL_STATIC=1
    local PKG_CONFIG_DIR=
    local PKG_CONFIG_LIBDIR=/usr/lib/aarch64-linux-gnu/pkgconfig

    local target="aarch64-unknown-linux-gnu"

    cargo clean
    cargo build --release --target $target
    cd target/$target/release/
    mkdir -p $TARGET_DIR/bin/aarch64/
    cp aloe fig $TARGET_DIR/bin/aarch64/
}

function build_cargo_armhf() {
    echo "build palm for armhf"
    cd $WORKSPACE

    local CC=arm-linux-gnueabihf-gcc
    local CXX=arm-linux-gnueabihf-g++
    local HOST_CC=gcc

    local PKG_CONFIG_ALLOW_CROSS=1
    local PKG_CONFIG_ALL_STATIC=1
    local PKG_CONFIG_DIR=
    local PKG_CONFIG_LIBDIR=/usr/lib/arm-linux-gnueabihf/pkgconfig

    local target="armv7-unknown-linux-gnueabihf"

    cargo clean
    cargo build --release --target $target
    cd target/$target/release/
    mkdir -p $TARGET_DIR/bin/armhf/
    cp aloe fig $TARGET_DIR/bin/armhf/
}

copy_assets() {
    echo "copy fig assets"
    cd $WORKSPACE/fig/
    if [ ! -d node_modules ]; then
        npm install
    fi
    local -a packages=(
        "bootstrap/dist"
        "bulma/css"
        "marked/marked.min.js"
        "material-design-icons/iconfont"
        "d3/dist"
        "@fontsource/roboto"
        "moment/dist"
        "moment-timezone/builds/moment-timezone-with-data.min.js"
        "@popperjs/core/dist"
        "mdb-ui-kit/css"
        "mdb-ui-kit/js"
        "mdb-ui-kit/img"
        "qrcodejs/qrcode.min.js"
        "@fortawesome/fontawesome-free/js"
        "@fortawesome/fontawesome-free/css"
        "@fortawesome/fontawesome-free/svgs"
        "@fortawesome/fontawesome-free/webfonts"
        "@fortawesome/fontawesome-free/sprites"
        "famfamfam-flags/dist"
        "famfamfam-silk/dist"
        "famfamfam-mini/dist"
    )
    for i in "${packages[@]}"; do
        local p=node_modules/$i
        local t=$(dirname "$TARGET_DIR/fig/$p")
        mkdir -p $t
        cp -a $p $t/
    done

    echo "copy palm assets"
    cd $WORKSPACE
    cp -a README.md LICENSE \
        $TARGET_DIR/

    echo "$GIT_VERSION" >$TARGET_DIR/VERSION
    echo "$(date -R)" >>$TARGET_DIR/VERSION
}

# -----------------------------------------------------------------------------
if [ $ID != "ubuntu" ]; then
    echo "unsupported system $ID"
    exit 1
fi

build_dashboard fig
build_dashboard aloe

install_deb amd64
build_cargo_x86_64

install_deb arm64
build_cargo_aarch64

install_deb armhf
build_cargo_armhf

copy_assets

mkdir -p $TARGET_DIR/fig
build_cargo fig

mkdir -p $TARGET_DIR/aloe
build_cargo aloe
build_dashboard aloe

cd $(dirname $target)
XZ_OPT=-9 tar -cJf $PKG_NAME.tar.xz $PKG_NAME

echo "done($GIT_VERSION)."
exit 0
