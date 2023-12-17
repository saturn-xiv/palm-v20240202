#!/bin/bash

set -e

export WORK_DIR=$PWD
export GIT_VERSION=$(git describe --tags --always --dirty --first-parent)
export TARGET=$WORK_DIR/tmp/palm-$GIT_VERSION

function build_phoenix() {
    echo "build $1 project"
    cd $WORK_DIR/$1
    mix deps.get --only prod
    MIX_ENV=prod mix compile
    MIX_ENV=prod mix assets.deploy
    MIX_ENV=prod mix phx.gen.release
    MIX_ENV=prod mix release --overwrite
    cp -r _build/prod/rel/$1 $TARGET/    
}

mkdir -p $TARGET

build_phoenix aloe
build_phoenix fig

cd $(dirname $TARGET)
tar jcf palm-$GIT_VERSION.tar.xz palm-$GIT_VERSION
md5sum palm-$GIT_VERSION.tar.xz

echo "done."
exit 0
