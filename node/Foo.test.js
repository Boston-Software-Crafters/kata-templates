const Foo = require("./Foo");

it("is named correctly", () => {
  expect(new Foo().getFoo()).toMatch(/Foo/);
});

it("computes Fibonacci correctly", () => {
  expect(new Foo().fibonacci(0)).toEqual(1);
  expect(new Foo().fibonacci(1)).toEqual(1);
  expect(new Foo().fibonacci(2)).toEqual(2);
  expect(new Foo().fibonacci(3)).toEqual(3);
});
