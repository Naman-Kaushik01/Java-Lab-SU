package oops;

abstract class AbsClass{
	String name="Naman";
	int hour =6;
	
	abstract void study();
}
class SubClass extends AbsClass{
	   public void study() {
		System.out.println(name+" Studies "+ hour +" hours in a day ");
	}
}



public class Modifiers {
	
	//Final
	
	final int x=5;
	final String name="Naman";
	
	// Static 
	
	static void staticMeth() {
		System.out.println("This is static method..");
	}
	
	//public method
	public void publicMethod() {
		System.out.println("This is public method.");
	}
	
	// Main Method
	public static void main(String[]args) {
		
		Modifiers myobj = new Modifiers();
		System.out.println(myobj.name);
		System.out.println(myobj.x);
		
		//myobj.name="harsh"; We use final attribute when we don't want the value to override.
		
		staticMeth(); // Static method can be called even without creating object.
		
		myobj.publicMethod();
		
		
		// Creating object of subclass of abstract class
		
		
		SubClass s1 = new SubClass();
		s1.study();
		
		
		
	}

}
