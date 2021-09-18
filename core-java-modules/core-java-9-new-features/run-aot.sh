#!/usr/bin/env bash
cd src/main/java
java -XX:AOTLibrary=./jaotCompilation.so com/surya/java9/aot/JaotCompilation