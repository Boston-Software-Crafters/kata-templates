import unittest
from foo import *

class TestFoo(unittest.TestCase):

	def test_named(self):
		self.assertEqual(get_foo(), 'Foo!')

class TestFibonacci(unittest.TestCase):

	def test_fibonacci(self):
		self.assertEqual(fibonacci(0), 1)
		self.assertEqual(fibonacci(1), 1)
		self.assertEqual(fibonacci(2), 2)
		self.assertEqual(fibonacci(3), 3)
		self.assertEqual(fibonacci(4), 5)


	def test_fibonacci_when_less_than_zero(self):
		self.assertEqual(fibonacci(-1), 1)
		self.assertEqual(fibonacci(0), 1)

class TestPerson(unittest.TestCase):

	def test_person(self):
		p = Person('John','Smith')
		self.assertEqual(p.full_name(), 'John Smith')


if __name__ == '__main__':
	unittest.main(verbosity=2)
