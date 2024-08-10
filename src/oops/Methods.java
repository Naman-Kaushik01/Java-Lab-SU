package oops;

// Methods in java

class carFunction{
	
	public void fullspeed() {
		System.out.println("The car is running out of control.");
	}
	public int showSpeeed(int speed) {
		System.out.println("The car is running at : "+speed);
		return speed;
		
	}
}


public class Methods {
	// Static Method : It can be accessed without creating object.
	
	static void staticMeth() {
		System.out.println("Static methods can be called without creating objects");
	}
	
	// Public Method: it cannot be accessed without creating object.
	
	public void publicMeth() {
		System.out.println("This method cannot be accessed without creating object.");
	}
	
	
	
	public static void main(String[]args) {
		staticMeth();
		Methods m1 = new Methods();
		m1.publicMeth();
		
		carFunction City = new carFunction();
		City.fullspeed();
		City.showSpeeed(200);
		
	}

}
