package basicJava;

public class minimumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		min();
		max();
		minmax();
	}

	public static void min() {
		int abc[][] = { { 2, 4, 5 }, { 3, 4, 7 }, { 1, 2, 9 } };
		int min = abc[0][0];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (abc[i][j] < min) {
					min = abc[i][j];
				}
			}
		}
		System.out.println(min);
	}

	public static void max() {
		int abc[][] = { { 2, 4, 5 }, { 3, 4, 7 }, { 1, 2, 9 } };
		int max = abc[0][0];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (abc[i][j] > max) {
					max = abc[i][j];
				}
			}
		}
		System.out.println(max);
	}

	public static void minmax() {
		int abc[][] = { { 2, 4, 5 }, { 3, 0, 7 }, { 1, 10, 9 } };
		int min = abc[0][0];
		int minColoumn = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (abc[i][j] < min) {
					min = abc[i][j];
					minColoumn = j;
				}
			}
		}
		int max = abc[0][minColoumn];
		int k = 0;
		while (k < 3) {
			if (abc[k][minColoumn] > max) {
				max = abc[k][minColoumn];
			}
			k++;
		}

		System.out.println(max);
	}

}