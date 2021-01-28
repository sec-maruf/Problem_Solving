package matrixProblems;

public class PrintMatrixDigonally {

	public static void print_Mat_Dig(int mat[][]) {
		int total_row = mat.length;
		int total_col = mat[0].length;
		for (int k = 0; k < total_row; k++) {
			int row = k;
			int col = 0;
			while (row >= 0) {
				System.out.print(mat[row][col] + " ");

				row = row - 1;
				col = col + 1;
			}
			System.out.println();
		}

		for (int k = 1; k < total_col; k++) {
			int row = total_row - 1;
			int col = k;
			while (col <= total_col - 1) {
				System.out.print(mat[row][col] + " ");

				row = row - 1;
				col = col + 1;

			}
			System.out.println();
		}
		System.out.println("*******************************************************");

		for (int k = 0; k < total_col; k++) {
			int row = 0;
			int col = k;
			while (col >= 0) {
				System.out.print(mat[row][col] + " ");
				row = row + 1;
				col = col - 1;
			}
			System.out.println();
		}

		for (int k = 1; k < total_row; k++) {
			int row = k;
			int col = total_col - 1;
			while (row < total_row) {
				System.out.print(mat[row][col] + " ");
				row = row + 1;
				col = col - 1;
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		print_Mat_Dig(mat);
	}
}
