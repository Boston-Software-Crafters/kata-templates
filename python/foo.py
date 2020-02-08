class Foo:

	def get_foo(self):
		return 'Foo!'
		
	def fibonacci(self, n):
		return 1 if n <= 1 else self.fibonacci(n - 1) + self.fibonacci(n - 2)
