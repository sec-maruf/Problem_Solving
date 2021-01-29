package matrixProblems;

import java.util.Scanner;

public class TransposeMatrix {
	public static void transposeMatrix(int matrix[][], int n) {
		int tempMatrix[][] = new int[n][n];
		for (int row = 0; row < tempMatrix.length; row++) {
			for (int col = 0; col < tempMatrix.length; col++) {
				tempMatrix[col][row] = matrix[row][col];
			}
		}
		for (int row = 0; row < tempMatrix.length; row++) {
			for (int col = 0; col < tempMatrix.length; col++) {
				System.out.print(tempMatrix[row][col] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
//		int matrix[][] = { { 1, 2 }, { -9, -2 } };
//		int length = matrix.length;
		Scanner userInput = new Scanner(System.in);
		int length = userInput.nextInt();
		int matrix[][] = new int[length][length];
		for (int row = 0; row < length; row++) {
			for (int col = 0; col < length; col++) {
				matrix[row][col] = userInput.nextInt();
			}
		}
		transposeMatrix(matrix, length);

	}

}
