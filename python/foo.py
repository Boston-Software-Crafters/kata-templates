def fibonacci(n):
	return 1 if n <= 1 else fibonacci(n - 1) + fibonacci(n - 2)

def get_foo():
	return 'Foo!'

class Person:
	def __init__(self, first, last):
		self.first = first
		self.last = last

	def full_name(self):
		return self.first + ' ' + self.last
