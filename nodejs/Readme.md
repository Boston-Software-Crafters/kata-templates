# Node Javascript Environment

- Node 12+
- Visual Studio Code
- Jest unit testing framework (API docs: [Globals](https://jestjs.io/docs/en/api), [Expect](https://jestjs.io/docs/en/expect))

# Setup

1. Install [Visual Studio Code](https://code.visualstudio.com/).
2. Install [Node 12+](https://nodejs.org/en/download/).
3. Clone this repo and `cd` into this directory
4. Open VS Code:
```
code node.code-workspace
```
5. Install dependencies and start running tests:
```
npm install
npm test
```

VS Code can also run the npm commands directly as tasks, displaying the output in the editor window. Click `Terminal > Run Task... > npm install/test`.

`npm test` watches files for changes and reruns tests when they change. Therefore it is convenient to start the test task in VS Code and leave it running while working on the Kata.