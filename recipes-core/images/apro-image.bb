DESCRIPTION = "A fully featured image for apro"
LICENSE = "GPL"

require recipes-images/angstrom/development-xfce-image.bb
require recipes-core/images/core-image-ros-roscore.bb

EXTRA_IMAGE_FEATURES += "debug-tweaks"

IMAGE_INSTALL += "\
	nano \
	roslaunch \
	imuraw-gy88 \
	imu-filter-madgwick \
	python-pip \
	git"

export IMAGE_BASENAME = "apro-image"
