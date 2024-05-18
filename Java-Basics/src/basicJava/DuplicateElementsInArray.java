package basicJava;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Source[] = {3,5,3,5,4}
		// Duplicate elements = 3,5

		// Initialize an array
		int arr[] = new int[] { 3, 5, 3, 5, 4 };
		System.out.println("Duplicate elements in a given array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}
}
