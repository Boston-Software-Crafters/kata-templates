import unittest
from foo import Foo


class TestFoo(unittest.TestCase):

	def test_named(self):
		self.assertEqual(Foo().get_foo(), 'Foo!')

	def test_fibonacci(self):
		self.assertEqual(Foo().fibonacci(0), 1)
		self.assertEqual(Foo().fibonacci(1), 1)
		self.assertEqual(Foo().fibonacci(2), 2)
		self.assertEqual(Foo().fibonacci(3), 3)
		self.assertEqual(Foo().fibonacci(4), 5)


if __name__ == '__main__':
	unittest.main(verbosity=2)
