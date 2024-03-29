#!/bin/bash

set -e

export PROTOBUF_ROOT=$HOME/.local
export WORKSPACE=$PWD
export PALM_PROTOCOLS=$WORKSPACE/palm/protocols

# -----------------------------------------------------------------------------

function generate_grpc_by_lang() {
    local target=$WORKSPACE/sdk/$1
    echo "generate sdk for grpc-$1"
    if [ -d $target ]; then
        rm -r $target
    fi
    mkdir -p $target
    $PROTOBUF_ROOT/bin/protoc -I $PALM_PROTOCOLS \
        -I $PROTOBUF_ROOT/include/google/protobuf \
        --${1}_out=$target --grpc_out=$target \
        --plugin=protoc-gen-grpc=$PROTOBUF_ROOT/bin/grpc_${1}_plugin \
        $PALM_PROTOCOLS/*.proto
}

function generate_grpc_for_cpp() {
    echo "generate gRPC-cpp"
    if [ -d $1/src ]; then
        rm -r $1/src
    fi
    if [ -d $1/include ]; then
        rm -r $1/include
    fi

    mkdir -p $1/src
    $PROTOBUF_ROOT/bin/protoc -I $PALM_PROTOCOLS \
        -I $PROTOBUF_ROOT/include/google/protobuf \
        --${1}_out=$1/src --grpc_out=$1/src \
        --plugin=protoc-gen-grpc=$PROTOBUF_ROOT/bin/grpc_${1}_plugin \
        $PALM_PROTOCOLS/*.proto
    mkdir -p $1/include
    mv $1/src/*.h $1/include/
}

# https://github.com/grpc/grpc-web#code-generator-plugin
function generate_grpc_for_typescript() {
    echo "generate typescript sdk($1)"
    if [ -d $1 ]; then
        rm -r $1
    fi
    mkdir -p $1

    $PROTOBUF_ROOT/bin/protoc -I $PALM_PROTOCOLS \
        -I $PROTOBUF_ROOT/include/google/protobuf \
        --js_out=import_style=commonjs,binary:$1 \
        --grpc-web_out=import_style=typescript,mode=grpcweb:$1 \
        $PALM_PROTOCOLS/*.proto
}

function generate_grpc_for_php() {
    local target=$WORKSPACE/sdk/php
    echo "generate sdk for grpc-php"
    if [ -d $target ]; then
        rm -r $target
    fi
    mkdir -p $target
    $PROTOBUF_ROOT/bin/protoc -I $PALM_PROTOCOLS \
        -I $PROTOBUF_ROOT/include/google/protobuf \
        --php_out=$target --grpc_out=generate_server:$target \
        --plugin=protoc-gen-grpc=$PROTOBUF_ROOT/bin/grpc_php_plugin \
        $PALM_PROTOCOLS/*.proto
}

function generate_thrift_for_java() {
    echo "generate thrift-java for $1"
    local target=$2/com/github/saturn_xiv/palm/plugins/$1/v1
    if [ -d $target ]; then
        rm -r $target
    fi
    thrift -out $2 --gen java -r $PALM_PROTOCOLS/$1.thrift
}

function generate_thrift_for_cpp() {
    cd $WORKSPACE

    echo 'generate thrift-cpp for $1'
    if [ -d $2/src ]; then
        rm -r $2/src
    fi
    if [ -d $2/include ]; then
        rm -r $2/include
    fi

    mkdir -p $2/src
    thrift -out $2/src --gen cpp:no_skeleton -r $PALM_PROTOCOLS/$1.thrift
    mkdir -p $2/include
    mv $2/src/*.h $2/include/
}

function generate_musa() {
    echo "generate gRPC for musa"

    cd $WORKSPACE
    local target=musa/src/main/java

    local musa_target=$target/com/github/saturn_xiv/palm/plugins/musa/v1
    if [ -d $musa_target ]; then
        rm -r $musa_target
    fi
    $PROTOBUF_ROOT/bin/protoc -I $PALM_PROTOCOLS \
        -I $PROTOBUF_ROOT/include/google/protobuf \
        --java_out=$target --grpc_out=$target \
        --plugin=protoc-gen-grpc=$PROTOBUF_ROOT/bin/grpc_java_plugin \
        $PALM_PROTOCOLS/musa.proto

}

function generate_gardenia() {
    cd $WORKSPACE
    local target=gardenia/src/main/java

    echo "generate gRPC for gardenia"
    local gardenia_target=$target/com/github/saturn_xiv/palm/plugins/gardenia/v1
    if [ -d $gardenia_target ]; then
        rm -r $gardenia_target
    fi
    $PROTOBUF_ROOT/bin/protoc -I $PALM_PROTOCOLS \
        -I $PROTOBUF_ROOT/include/google/protobuf \
        --java_out=$target --grpc_out=$target \
        --plugin=protoc-gen-grpc=$PROTOBUF_ROOT/bin/grpc_java_plugin \
        $PALM_PROTOCOLS/gardenia.proto
}

function generate_morus() {
    echo "generate code for morus"
    local target=$WORKSPACE/morus/src/protocols
    if [ -d $target ]; then
        rm -r $target
    fi
    mkdir -p $target
    grpc_tools_node_protoc -I $PALM_PROTOCOLS \
        -I $PROTOBUF_ROOT/include/google/protobuf \
        --js_out=import_style=commonjs,binary:$target \
        --grpc_out=grpc_js:$target $PALM_PROTOCOLS/morus.proto
}

function generate_lily() {
    echo "generate code for lily"
    local target=$WORKSPACE/lily/palm
    local -a files=(
        "lily_pb2.py"
        "lily_pb2_grpc.py"
    )

    for f in "${files[@]}"; do
        if [ -f $target/$f ]; then
            rm $target/$f
        fi
    done

    $PROTOBUF_ROOT/bin/protoc -I $PALM_PROTOCOLS \
        -I $PROTOBUF_ROOT/include/google/protobuf \
        --python_out=$target --grpc_out=$target \
        --plugin=protoc-gen-grpc=$PROTOBUF_ROOT/bin/grpc_python_plugin \
        $PALM_PROTOCOLS/lily.proto
    sed -i 's/import lily_/from . import lily_/g' $target/lily_pb2_grpc.py
}

# -----------------------------------------------------------------------------

# generate_diesel_postgresql "postgres://www:change-me@127.0.0.1:5432/demo"
# DATABASE_URL=tmp/db diesel print-schema >ops/router/src/schema.rs

declare -a languages=(
    "python"
    "ruby"
    "csharp"
    # https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-java/
    "java"
    # "objective_c"
)

for l in "${languages[@]}"; do
    generate_grpc_by_lang $l
done

generate_grpc_for_php
generate_grpc_for_cpp
generate_typescript $WORKSPACE/sdk/typescript

generate_thrift_for_cpp loquat $WORKSPACE/loquat/gourd
generate_musa
generate_gardenia
generate_morus
generate_lily

echo 'format rust code'
cd $WORKSPACE
cargo fmt

echo 'done.'
exit 0
