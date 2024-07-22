# 原神启动器

音频文件请放到res下的raw文件夹下

使用相同原理，可以做其他应用的启动器：
使用aapt工具（一般在Android/sdk/build-tools/28.0.3）
使用命令：aapt d badging apk的路径
反编译出目标.apk安装包的package名和activity名
将package名和activity替换到原来的原神package名和activity名的位置上
