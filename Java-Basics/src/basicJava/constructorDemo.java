package basicJava;

public class constructorDemo {

	// Default
	public constructorDemo() {
		System.out.println("I am in constructor");
	}

	public void getDemo() {
		System.out.println("I am in Method");
	}

	// Parameterized constructor
	public constructorDemo(int a, int b) {
		System.out.println("I am in the parameterized constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Constructor -> executes block of code whenever object is created
		// will not return values
		// name will be as same as class name

		constructorDemo cd = new constructorDemo();
		// whenever object is created constructor is called
		// if not defined in call, compiler will call default/implicit constructor
		// if there are some constructor defined in class, in that case compiler will not call implicit constructor
		constructorDemo c = new constructorDemo(4,5);

	}

}
