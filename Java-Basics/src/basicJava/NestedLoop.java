package basicJava;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// nestloop();
		// pyramid();
		//loop2();
		loop3();
	}

	public static void nestloop() {
		// Nested loop->
		for (int i = 1; i <= 4; i++) // outer loop, 4 times execution
		{
			for (int j = 1; j <= 4; j++) // inner loop, 16 times execution
			{
				System.out.println(j);
			}
		}
	}

	public static void pyramid() {
		// Nested loop->
		int k = 1;
		for (int i = 0; i <= 4; i++) // outer loop, 4 times execution
		{
			for (int j = 1; j <= 4 - i; j++) // inner loop, 16 times execution
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}
	}

	public static void loop2() {
		int k = 1;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}
	}
	public static void loop3() {
		//int k = 1;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
				System.out.print("\t");
				//k++;
			}
			System.out.println("");
		}
	}
}
