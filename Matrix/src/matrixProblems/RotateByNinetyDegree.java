package matrixProblems;

import java.util.Scanner;

public class RotateByNinetyDegree {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);

		int sizeOfMatrix = userInput.nextInt();
		int[][] matrix = new int[sizeOfMatrix][sizeOfMatrix];

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix.length; col++) {
				matrix[row][col] = userInput.nextInt();
			}
		}

		rotateByNinetyDegree(matrix, sizeOfMatrix);

	}

	public static void rotateByNinetyDegree(int[][] matrix, int n) {
		int tempMatrix[][] = new int[n][n];

		for (int row = 0; row < tempMatrix.length; row++) {
			for (int col = 0; col < tempMatrix.length; col++) {
				tempMatrix[row][col] = matrix[col][row];

			}

		}

		for (int row = 0; row < tempMatrix.length; row++) {
			for (int col = 0; col < tempMatrix.length; col++) {
				System.out.print(tempMatrix[matrix.length - 1 - row][col] + " ");

			}
			System.out.println();
		}

	}

}
