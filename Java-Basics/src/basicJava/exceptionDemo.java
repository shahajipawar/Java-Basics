package basicJava;

// one try block can be followed by multiple catch blocks
// catch should be followed by immediate try block
public class exceptionDemo {

	int a = 4;

	// try catch mechanism
	int b = 7;
	int c = 0;
	int k = b / c;

	public void getData() {

		System.out.println(k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// exceptionDemo obj = new exceptionDemo();
		// obj.getData();

		try {
			int y = 9;
			int z = 0;
			// int c = y / z;
			// System.out.println(c);

			int arr[] = new int[5];
			System.out.println(arr[7]);
		} catch (ArithmeticException et) {
			System.out.println("I catched the Arithmetic/exception");
		} catch (IndexOutOfBoundsException ets) {
			System.out.println("I catched the IndexBound/exception");
		} catch (Exception e) {
			System.out.println("I catched the execption");
		}
		
		finally
		{
			// this block is executed irrespective of exception thrown or not
			// cannot work without try block, but can work without catch block
			System.out.println("delete cookies");
		}

	}
}
