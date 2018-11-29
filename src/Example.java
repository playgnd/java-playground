import person.Person;
/*
This is a simple Java program.
Call this file "Example.java".
*/
class Example {
	// Your program begins with a call to main().
	public static void main(String args[]) {
		System.out.println("This is a simple Java program.");

    Person person = new Person("Superman");
    System.out.println(person.toString());
	}
}
