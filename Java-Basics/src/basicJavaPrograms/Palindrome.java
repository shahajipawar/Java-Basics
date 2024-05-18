package basicJavaPrograms;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A palindrome number is a number which is same after reverse
		// For Example - 151, 171, 343, 34543, 48984
		int rem, sum = 0, temp;
		int num = 15;
		temp = num; // temp=151
		while (num > 0) { // 15,>0, 1>0, 0>0(failed, so go to if loop)
			rem = num % 10; // 151%10=1, 15%10=5, 1%10=1
			sum = (sum * 10) + rem; // (0*10)+1=1, (1*10)+5=15, (15*10)+1=151
			num = num / 10; // 151/10=15, 15/10=1, 1/10=0
		}
		if (temp == sum) {
			System.out.println("It is a Palindrome number");
		} else {
			System.out.println("It is not a Palindrome number");
		}
	}
}
