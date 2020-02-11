# Java Environment

- Java 11
- Visual Studio Code
- [JUnit 5](https://junit.org/junit5/docs/current/user-guide/)
  - That is included in the `/lib/` directory.

# Setup

1. Install [Visual Studio Code](https://code.visualstudio.com/).
2. Install [Java SE](https://www.oracle.com/technetwork/java/javase/downloads/index.html).
3. Clone this repo and `cd` into this directory
4. Open VS Code:
```
code java.code-workspace
```
5. Install [Java Extension Pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack) for Visual Studio Code.
6. Start running tests:
```
export JUNIT="./lib/junit-platform-console-standalone-1.6.0.jar"
export CLASSPATH=".:$JUNIT"
javac -cp $CLASSPATH *.java
java -jar $JUNIT -cp . --scan-classpath
```

With the Java Extension Pack, VS Code can also run unit tests under the "Test" (the beaker on left) section and select "Run All Tests" (the double arrow on top-left) to run all the tests.
