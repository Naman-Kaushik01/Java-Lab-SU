package oops;

class Overload{
	public void Greet() {
		System.out.println("Good Morning from overload");
	}
	public void Greet(String name) {
		System.out.println("Good Morning " +name);
	}
}
class Override extends Overload{
	public void Add() {
		System.out.println("Hii from override ");
	}
	public void Greet() {
		System.out.println("Good afternoon from override class");
	}
	
}

public class Overloading {
	
	public static void main(String[] args) {
		Overload o1 = new Overload();
		o1.Greet();
		o1.Greet("Chaitanya");
		Override o2 = new Override();
		o2.Greet("Chaitanya");
	}

}
