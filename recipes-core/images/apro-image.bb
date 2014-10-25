DESCRIPTION = "A fully featured image for apro"
LICENSE = "GPL"

inherit core-image

DEPENDS = "core-image-ros-roscore"

IMAGE_FRATURES += "debug_tweaks ssh-server-openssh"

CORE_IMAGE_EXTRA_INSTALL += " nano \
        imuraw-gy88 \
        imu-filter \
        i2c-tools \
        opkg \
        vim \
        hostapd \
        wireless-tools \
        net-tools \
        packagegroup-core-ssh-openssh \
        packagegroup-core-buildessential \
        packagegroup-core-full-cmdline \
        rosbash \
        rostopic"
