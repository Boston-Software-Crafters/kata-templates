class Foo
{
	public String getFoo()
	{
		return "Foo!";
	}

	public int fibonacci(int n)
	{
		return n <= 1 ? 1 : fibonacci(n - 1) + fibonacci(n - 2);
	}
}