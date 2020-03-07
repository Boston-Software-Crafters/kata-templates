import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FooTest
{
	@Test
	void testGetFoo() {
		assertEquals("Foo!", Foo.getFoo(), "Must expect \"Foo!\"");
	}

	@Test
	void testFibonacci() {
		assertEquals(1, Foo.fibonacci(1), "fibonacci(0) != 1");
		assertEquals(1, Foo.fibonacci(1), "fibonacci(1) != 1");
		assertEquals(2, Foo.fibonacci(2), "fibonacci(2) != 2");
		assertEquals(3, Foo.fibonacci(3), "fibonacci(3) != 3");
		assertEquals(5, Foo.fibonacci(4), "fibonacci(4) != 5");
	}

	@Test
	void testPersonClass() {
		Person p = new Person("John", "Smith");
		assertEquals("John Smith", p.fullName());
	}

	@Test
	void testFail() {
		assertEquals(1, 2, "Fix Me!");
	}
}