package staticConcept;

public class staticMethod {

	static int loverRollno = 48;
	static String Name = "Ex-M";
	//int j=100; Static Method can access only static variables
    public static void display()
	{
	System.out.println(Name);
	System.out.println(loverRollno);
	//System.out.println(j);
	}
	
	void nonStaticMethod()
	{
		display();
	}
	public static void main(String[] args) {
	
		display(); //Directly Access Static Method without Creating the OBJECTS 
		// staticMethod.display(); or call by class Name
		staticMethod obj = new staticMethod(); //just Creating object to access non-static method
		obj.nonStaticMethod();

	}
}

//Static Methods can access class variables(static variables) without using object(instance) of the class
//however non-static methods and non-static variables can only be accessed using objects.
//Static methods can be accessed directly in static and non-static methods.
