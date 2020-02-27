import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FooTest
{
	private final Foo foo = new Foo();

	@Test
	void testGetFoo() {
		assertEquals("Foo!", foo.getFoo(), "Must expect \"Foo!\"");
	}

	@Test
	void testFibonacci() {
		assertEquals(1, foo.fibonacci(1), "fibonacci(0) != 1");
		assertEquals(1, foo.fibonacci(1), "fibonacci(1) != 1");
		assertEquals(2, foo.fibonacci(2), "fibonacci(2) != 2");
		assertEquals(3, foo.fibonacci(3), "fibonacci(3) != 3");
		assertEquals(5, foo.fibonacci(4), "fibonacci(4) != 5");
	}

	@Test
	void testFail() {
		assertEquals(1, 2, "Fix Me!");
	}
}