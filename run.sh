export JAVA_HOME=/Library/Java/JavaVirtualMachines/graalvm-ce-java11-22.3.1/Contents/Home
export PATH=/Library/Java/JavaVirtualMachines/graalvm-ce-java11-22.3.1/Contents/Home/bin:$PATH

java -version

./gradlew nativecompile