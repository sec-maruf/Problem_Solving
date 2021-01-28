package matrixProblems;

import java.util.Scanner;

public class MaxSum_Of_Hour_Glass {

	public static int maxSumFromHourGlass(int matrix[][]) {
		int currentMaxSum = -9;
		int maxSum = 0;
		int r = matrix.length;
		int c = matrix[0].length;
		if (r < 3 || c < 3) {
			currentMaxSum = -1;
		}
		for (int row = 0; row < r - 2; row++) {
			for (int col = 0; col < c - 2; col++) {
				maxSum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2] + matrix[row + 1][col + 1]
						+ matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];
				if (maxSum > currentMaxSum) {
					currentMaxSum = maxSum;
				}
			}

		}
		return currentMaxSum;
	}

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		int testCase = userInput.nextInt();
		for (int i = 0; i < testCase; i++) {
			int r = userInput.nextInt();
			int c = userInput.nextInt();
			int matrix[][] = new int[r][c];
			for (int row = 0; row < r; row++) {
				for (int col = 0; col < c; col++) {
					matrix[row][col] = userInput.nextInt();
				}
			}
			System.out.println(maxSumFromHourGlass(matrix));
		}

	}

}
