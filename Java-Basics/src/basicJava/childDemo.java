package basicJava;

public class childDemo extends parentDemo {

	String name = "ShawTestAcademy";

	public childDemo() {
		super(); //this should always be first line in child constructor
		System.out.println("I am child class constructor");
	}

	public void getStringData() {
		System.out.println(name);
		System.out.println(super.name); // access parent class variable
	}

	public void getdata() {
		super.getdata(); // Access parent class method
		System.out.println("I am in child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childDemo obj = new childDemo();
		obj.getStringData();
		obj.getdata();
	}
}
