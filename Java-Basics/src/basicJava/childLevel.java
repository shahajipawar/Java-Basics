package basicJava;

//function overloading
//either argument count should be different or argument data type should be different 
public class childLevel {

	public void getData(int a) {
		System.out.println(a);
	}

	public void getData(String a) {
		System.out.println(a);
	}

	public void getData(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childLevel c1 = new childLevel();
		c1.getData(2);
		c1.getData("Hello");
		c1.getData(20, 50);
	}

}
