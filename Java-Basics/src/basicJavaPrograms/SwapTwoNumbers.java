package basicJavaPrograms;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 10;
		int number2 = 20;
		int temp = 0;
		System.out.println("Before Swap: " + number1 + ", " + number2);

		temp = number1; // temp=10
		number1 = number2; // number1=20
		number2 = temp; // number2=10
		System.out.println("After swap: " + number1 + ", " + number2);

	}

}
