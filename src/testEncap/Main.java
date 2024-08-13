package testContructor;

//Encapsulation : Hiding its implementation
public class Main {
	
	private int age;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	public static void main(String[]args) {
		
		
		Main m1 = new Main();
		m1.setName("Naman");
		m1.setAge(19);
		System.out.println(m1.getName());
		System.out.println(m1.getAge());
	}

}
