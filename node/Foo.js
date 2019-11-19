module.exports = class Foo {
  getFoo() {
    return "Foo!";
  }

  fibonacci = n => {
    return n <= 1 ? 1 : this.fibonacci(n - 1) + this.fibonacci(n - 2);
  };
};
