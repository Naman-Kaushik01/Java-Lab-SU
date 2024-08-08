package oops;

class Car {
	public void opendoor() {
		System.out.println("Opening the Door");
	}
	public void closedoor() {
		System.out.println("Closing the Door");
	}
}

public class main {
public static void main(String[]args) {
	
	Car c1 = new Car();
	c1.opendoor();
	c1.closedoor();
}
}
