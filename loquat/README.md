# LOQUAT

## By Cmake(ONLY support focal yet)

```bash
$ mkdir build
$ cd build
# for ubuntu
$ sudo apt install -y cmake g++-12 golang libunwind-dev libboost-all-dev libevent-dev
# for archlinux
$ sudo pacman -S --needed cmake gcc12 go libunwind boost libevent

$ CC=gcc-12 CXX=g++-12 cmake -DCMAKE_BUILD_TYPE=Release \
    -DABSL_PROPAGATE_CXX_STD=ON -DTINK_USE_SYSTEM_OPENSSL=ON \
    -DBUILD_COMPILER=OFF -DWITH_OPENSSL=ON -DWITH_QT5=OFF -DBUILD_C_GLIB=OFF -DBUILD_JAVA=OFF -DBUILD_JAVASCRIPT=OFF -DBUILD_NODEJS=OFF -DBUILD_PYTHON=OFF \
    ..
$ make loquat
```

## By Qemu

```bash
sudo pacman -S qemu-full
cp /usr/share/AAVMF/AAVMF_CODE.fd flash-1.img
python mac.py

sudo qemu-system-aarch64 -m 4096 -cpu cortex-a57 -M virt -nographic -pflash /usr/share/AAVMF/AAVMF_CODE.fd -pflash flash-1.img -drive if=none,file=jammy-server-cloudimg-arm64.img,id=hd0 -device virtio-blk-device,drive=hd0 -nic bridge,br=virbr0,model=virtio-net-pci
# -netdev type=tap,id=net0 -device virtio-net-device,netdev=net0,mac='00:16:3e:58:4c:91'
```

- [Ubuntu 22.04 (Jammy Jellyfish) Daily Build](https://cloud-images.ubuntu.com/jammy/current/)
- [QEMU](https://wiki.archlinux.org/title/QEMU)
- [Network bridge](https://wiki.archlinux.org/title/Network_bridge)

## [Creating the Certificate Authority's Certificate and Keys](https://mariadb.com/docs/xpand/security/data-in-transit-encryption/create-self-signed-certificates-keys-openssl/)

```bash
openssl genrsa -out ca.key 4096
openssl req -new -x509 -nodes -days 36500 -key ca.key -out ca.crt

openssl req -newkey rsa:4096 -nodes -days 3650 -keyout node.key -out node.csr
openssl x509 -req -days 3650 -set_serial 01 -in node.csr -out node.crt -CA ca.crt -CAkey ca.key
openssl verify -CAfile ca.crt node.crt

openssl rsa -noout -text -in node.key
openssl req -noout -text -in node.csr
openssl x509 -noout -text -in node.crt
```
