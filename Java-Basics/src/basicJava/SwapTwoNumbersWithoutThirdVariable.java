package basicJava;

public class SwapTwoNumbersWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 10;
		int number2 = 20;
		System.out.println("Before Swap: " +number1+ ", " +number2);
		
		number1=number1+number2;	//number1=30
		number2=number1-number2;	//number2=10
		number1=number1-number2;	//number1=20
		System.out.println("After swap: " +number1+ ", " +number2);

	}

}
