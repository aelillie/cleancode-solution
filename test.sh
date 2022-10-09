#!/bin/bash
currentPath=$(pwd)
targetFolder=target
libFolder=lib
junitJar=junit-platform-console-standalone-1.9.1.jar
srcFolder=src

javac -d $targetFolder -cp $currentPath/$targetFolder:$currentPath/$libFolder/$junitJar $srcFolder/*.java
java -jar $libFolder/$junitJar --class-path $targetFolder --scan-class-path --disable-banner