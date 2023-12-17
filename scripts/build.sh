#!/bin/bash

set -e

export WORK_DIR=$PWD
export GIT_VERSION=$(git describe --tags --always --dirty --first-parent)
export TARGET=$WORK_DIR/tmp/palm-$GIT_VERSION

function build_phoenix() {
    cd $WORK_DIR/$1
    mix deps.get --only prod
    MIX_ENV=prod mix compile
    MIX_ENV=prod mix assets.deploy
    MIX_ENV=prod mix phx.gen.release
    cp -r _build/prod/rel/$1 $TARGET/
    tar jcvf $1.tar.xz $1
}

mkdir -p $TARGET
cd $(dirname $TARGET)
tar jcf palm-$GIT_VERSION.tar.xz palm-$GIT_VERSION

echo 'done.'
exit 0
