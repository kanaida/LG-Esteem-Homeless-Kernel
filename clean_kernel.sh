echo LG-MS910 Kernel Build
echo Setting up build environment...
KS=$(pwd)/kernel/scripts
CC=$(pwd)/prebuilt/linux-x86/toolchain/arm-eabi-4.4.3/bin
CC1=$(pwd)/prebuilt/linux-x86/toolchain/arm-eabi-4.4.3/libexec/gcc/arm-eabi/4.4.3
#CC=/home/kanaida/arm-toolchain/bin
#CC1=/home/kanaida/arm-toolchain/libexec/gcc/arm-none-eabi/4.6.1
export PATH=${KS}:${CC}:${CC1}:$PATH
export TARGET_PRODUCT=lge_bryce
export BUILD_LG_HW_MS910_REV=5
export TARGET_BUILD_VARIANT=user
export TARGET_LTE_IMAGE=persist
cd kernel
echo Loading Kernel Defaults for MS910...
make ARCH=arm lge_bryce-perf_defconfig
echo Compiling Kernel...
make clean -j16 ARCH=arm CROSS_COMPILE=${CC}/arm-eabi-
#make -j16 ARCH=arm CROSS_COMPILE=${CC}/arm-eabi-
echo Kernel Built.
cd arch/arm/boot
