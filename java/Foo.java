class Foo
{
	public static String getFoo()
	{
		return "Foo!";
	}

	public static int fibonacci(int n)
	{
		return n <= 1 ? 1 : fibonacci(n - 1) + fibonacci(n - 2);
	}
}

class Person
{
	String firstName;
	String lastName;

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String fullName() {
		return this.firstName+' '+this.lastName;
	}

}