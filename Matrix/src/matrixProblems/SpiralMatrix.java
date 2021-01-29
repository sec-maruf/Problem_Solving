package matrixProblems;

public class SpiralMatrix {
	public void convertAnyMatrixToSpiralMatrix(int matrix[][]) {
		int m = matrix.length;
		int n = matrix[0].length;
		int top = 0, down = m - 1, left = 0, right = n - 1;
		/**
		 * when direction =0 means left to right. when direction= 1 means top to down.
		 * when direction= 2 means right to left. when direction=3 means down to top.
		 */

		int direction = 0;
		while (top < m && left < n) {
			if (direction == 0) {
				for (int i = left; i <= right; i++) {
					System.out.print(matrix[top][i] + " ");
				}
				top = top + 1;
			}

			else if (direction == 1) {
				for (int i = top; i <= down; i++) {
					System.out.print(matrix[i][right] + " ");
				}
				right = right - 1;
			}

			else if (direction == 2) {
				for (int i = right; i >= left; i--) {
					System.out.print(matrix[down][i] + " ");
				}
				down = down - 1;
			}

			else if (direction == 3) {
				for (int i = down; i >= top; i--) {
					System.out.print(matrix[i][left] + " ");
				}
				left = left + 1;
			}

			direction = (direction + 1) % 4;

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		SpiralMatrix spiralMatrix = new SpiralMatrix();
		spiralMatrix.convertAnyMatrixToSpiralMatrix(matrix);

	}

}
