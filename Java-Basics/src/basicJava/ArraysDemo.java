package basicJava;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		a = 4;
		// Array -> A container which stores multiple values of same data type
		int b[] = new int[5]; // Declares an array and allocates memory to the values
		int c[] = new int[10]; 
		b[0] = 2;
		b[1] = 6;
		b[2] = 1;
		b[3] = 9;
		b[4] = 12;//initialize values into array
		int d[] = {1,2,3,4,5,6};

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}

	}

}
