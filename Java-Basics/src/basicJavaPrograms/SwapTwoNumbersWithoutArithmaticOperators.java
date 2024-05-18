package basicJavaPrograms;

public class SwapTwoNumbersWithoutArithmaticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 5;
		int number2 = 7;
		System.out.println("Before Swap: " + number1 + ", " + number2);

		number1 = number1 ^ number2; // 5^7=2
		number2 = number1 ^ number2; // 2^7=5
		number1 = number1 ^ number2; // 2^5=7
		System.out.println("After swap: " + number1 + ", " + number2);
		// Bitwise XOR (^) operator - Binary operator in java (Decimal to binary
		// conversion)
	}

}
