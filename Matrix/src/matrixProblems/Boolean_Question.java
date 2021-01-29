package matrixProblems;

public class Boolean_Question {
	public static void modifyMatrix(int matrix[][]) {
		int temp[][] = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				temp[i][j] = 0;
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 1) {
					for (int k = 0; k < matrix[0].length; k++) {
						temp[i][k] = 1;

					}

				}

			}

		}

		for (int col = 0; col < matrix[0].length; col++) {
			for (int row = 0; row < matrix.length; row++) {

				if (matrix[row][col] == 1) {

					for (int temp_col = 0; temp_col < matrix.length; temp_col++) {
						temp[temp_col][col] = 1;
					}

				}

			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(temp[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// int matrix[][] = { { 1, 0, 0 }, { 1, 1, 0 }, { 0, 0, 0 } };
		int matrix[][] = { { 1, 0 }, { 0, 0 } };
		// int matrix[][] = { { 0, 0, 0 }, { 0, 0, 1 } };
		modifyMatrix(matrix);
	}

}
