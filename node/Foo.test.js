const Foo = require('./Foo')

describe('Foo tests', () => {
  it('Returns Foo', () => {
    expect(Foo.getFoo()).toMatch(/Foo/)
  })
})

describe('Fibonacci tests', () => {
  it('computes Fibonacci correctly', () => {
    expect(Foo.fibonacci(1)).toEqual(1)
    expect(Foo.fibonacci(2)).toEqual(2)
    expect(Foo.fibonacci(3)).toEqual(3)
    expect(Foo.fibonacci(4)).toEqual(5)
  })
  it('Numbers less than 0 return 1', () => {
    expect(Foo.fibonacci(0)).toEqual(1)
    expect(Foo.fibonacci(-1)).toEqual(1)
  })
})

describe('Person class tests', () => {
  it('Full name returns correct value', () => {
    const p = new Foo.Person ('John', 'Smith')
    expect(p.fullName()).toEqual('John Smith')
  })
})
