#!/usr/bin/env sh
set -e
DIR="$(cd "$(dirname "$0")" && pwd)"
APP_HOME="$DIR"
CLASSPATH="$APP_HOME/gradle/wrapper/gradle-wrapper.jar"
if [ ! -f "$CLASSPATH" ]; then
  echo "Downloading gradle-wrapper.jar..."
fi
exec java -classpath "$CLASSPATH" org.gradle.wrapper.GradleWrapperMain "$@"
