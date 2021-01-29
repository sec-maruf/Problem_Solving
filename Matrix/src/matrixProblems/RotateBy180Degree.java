package matrixProblems;

import java.util.Scanner;

public class RotateBy180Degree {
	public static void RotateBy180Degree(int matrix[][]) {
		int tempMatrix[][] = new int[matrix.length][matrix.length];

		for (int row = 0; row < tempMatrix.length; row++) {
			for (int col = 0; col < tempMatrix.length; col++) {
				tempMatrix[row][col] = matrix[row][tempMatrix.length - 1 - col];

			}

		}

		for (int row = 0; row < tempMatrix.length; row++) {
			for (int col = 0; col < tempMatrix.length; col++) {
				System.out.print(tempMatrix[matrix.length - 1 - row][col] + " ");

			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		int testCase = userInput.nextInt();
		for (int i = 0; i < testCase; i++) {
			int sizeOfMatrix = userInput.nextInt();
			int[][] matrix = new int[sizeOfMatrix][sizeOfMatrix];

			for (int row = 0; row < matrix.length; row++) {
				for (int col = 0; col < matrix.length; col++) {
					matrix[row][col] = userInput.nextInt();
				}
			}

			RotateBy180Degree(matrix);
		}
	}

}
