#!/bin/sh


SRC_DIR="src"
BUILD_DIR="build"

MAIN_CLASS="replacer.Replacer"

JAVA_CLASSPATH_ARG="-cp $BUILD_DIR:$SRC_DIR"


cd_to_script_location()
{
    script_location="$(dirname "$0")"
    cd "$script_location"
}


compile()
{
	rm -rf "$BUILD_DIR"
	mkdir -p "$BUILD_DIR"
	find "$SRC_DIR" -name '*.java' -exec javac $JAVA_CLASSPATH_ARG -d "$BUILD_DIR" {} +
}

run()
{
	java $JAVA_CLASSPATH_ARG "$MAIN_CLASS"
}


cd_to_script_location
compile
run

