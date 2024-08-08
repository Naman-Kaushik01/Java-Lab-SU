package oops;

class Car {
	
	public void opendoor() 
	{
		System.out.println("Opening the Door");
	}
	public void closedoor() {
		System.out.println("Closing the Door");
	}
}

public class main {
	
	int x;
	String name="Naman";
	
public static void main(String[]args) {
	
	main m1= new main();
	m1.x=10;
	m1.name="Harsh";
	System.out.println(m1.name);
	System.out.println(m1.x);
	
	
	Car c1 = new Car();
	c1.opendoor();
	c1.closedoor();
}
}
