package basicJava;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//In math prime numbers are whole numbers greater than 1, and that have only two factors ->1 and the number itself 
//Prime numbers are divisible only by the number 1 or itself Ex:2,3,5,7,11,13,17,19,23,29,31,37,43,47,53,59 etc.
		int number = 43;
		int temp = 0;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				temp = temp + 1;
				break;
			}
		}
		if (temp == 0)
			System.out.println("Number is prime");
		else {
			System.out.println("number is not a prime");
		}
	}
}
