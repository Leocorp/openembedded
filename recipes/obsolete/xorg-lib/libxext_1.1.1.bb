require xorg-lib-common.inc
DESCRIPTION = "X11 miscellaneous extension library"
DEPENDS += "xproto virtual/libx11 xextproto libxau"
PE = "1"
PR = "${INC_PR}.0"

SRC_URI[archive.md5sum] = "c417c0e8df39a067f90a2a2e7133637d"
SRC_URI[archive.sha256sum] = "110ce3bc7fb3a86659556994d0801c74bedcbd8ba8d1f90ee33d4c47a91e9bb3"

BBCLASSEXTEND = "native nativesdk"

XORG_PN = "libXext"
