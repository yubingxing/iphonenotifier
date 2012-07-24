#!/bin/bash

# Build
sbt clean update compile copy-resources package

set DIST=target\dist

# Package structure
rd /s /q %DIST%
mkdir %DIST%\bin 
mkdir %DIST%\lib 
mkdir %DIST%\conf
copy lib_managed/scala_2.9.0.1/compile/* $DIST/lib
copy target/scala_2.9.0.1/notifier_2.9.0.1-1.0.jar $DIST/lib
copy target/scala_2.9.0.1/resources/* $DIST/conf

copy src/main/bash/* $DIST/bin
#chmod +x $DIST/bin/*