#!/bin/bash

set -e

export VERSION=$(date "+%4Y%m%d%H%M%S")
export CODE="palm-spring"

buildah pull archlinux:latest
buildah bud --layers -t $CODE .
podman save --format=oci-archive -o $CODE-$VERSION.tar $CODE
split -d -b 3G $CODE-$VERSION.tar $CODE-$VERSION.tar.
md5sum $CODE-$VERSION.tar* >$CODE-$VERSION.md5
# cat $CODE-$VERSION.tar.?? >$CODE-$VERSION.tar

echo "done($CODE-$VERSION.tar)."

exit 0
