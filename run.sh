#!/bin/bash
srcFolder=src
mainClass=Main

javac -d target -cp $srcFolder $srcFolder/$mainClass.java
java -cp target $mainClass