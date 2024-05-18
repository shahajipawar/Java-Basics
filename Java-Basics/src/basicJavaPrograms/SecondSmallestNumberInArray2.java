package basicJavaPrograms;

public class SecondSmallestNumberInArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// arr[] = {6,2,7,3,5}
		// Second largest number in array - 6
		// Second smallest number in array - 3
		int arr[] = { 8, 2, 5, 15, 25, 23 };
		int temp, size;
		size = arr.length;
		System.out.println("Size of the array is: " + size);

		// Sort array in ascending order
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("Elements of array in Descending order");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		// Second largest number
		System.out.println();
		System.out.println("Second smallest number is " + arr[size - 2]);
	}
}
