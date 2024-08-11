package oops;

// Learning Constructor

class Bike{
	int modelYear;
	String modelname;

//You can have as many parameters as you want:
public Bike(int model,String name) {
           modelYear=model;
           modelname=name;
}
}

public class Constructor {
	int x=5;
	
	public Constructor(int y) {
		x=y;
	}

	public static void main(String[]args) {
		Constructor c1 = new Constructor(8);
		System.out.println(c1.x);
		
		// Calling constructor of class Bike
		
		Bike b1 = new Bike(2019,"Splendor");
		System.out.println("The bike is "+b1.modelname + " Purchasing Year " + b1.modelYear);
		
		
		
	}
}

