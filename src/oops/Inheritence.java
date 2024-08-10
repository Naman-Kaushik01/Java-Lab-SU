package oops;

// Extends Keyword is used to inherit a class.

class Phone {
	public void call() {
		System.out.println("Calling..");
	}
	public void rcvCall() {
		System.out.println("Recieving call..");
	}
}

class Smartphone extends Phone{
	public void takePic() {
		System.out.println("Captured Your Photo..");
	}
	public void playMusic() {
		System.out.println("Playing Music..");
	}
	
}
public class Inheritence {
	public static void main(String []args) {
		Smartphone Vivo =new Smartphone();
		Vivo.call();
		Vivo.rcvCall();
		Vivo.takePic();
		Vivo.playMusic();
	}

}
