package basicJava;

public class thisDemo {

	int a = 2; // Global variable

	public void getData() {
		int a = 3; // Local variable
		System.out.println(a); // a=3
		// this refers to current object -> Object lies in class level
		System.out.println(this.a); // a=2
		// this refers to value from object level, class level

		int b = a + this.a; // summation of local & global variable value
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisDemo obj = new thisDemo();
		obj.getData();
	}

}
