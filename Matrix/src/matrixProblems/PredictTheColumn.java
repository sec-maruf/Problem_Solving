package matrixProblems;

public class PredictTheColumn {
	public static void getMaxCol(int matrix[][]) {

		int maxZero = 0;
		int temp = 0;
		for (int i = 0; i < matrix.length; i++) {
			int count = 0;
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[j][i] == 0) {
					count++;

				}

			}
			if (maxZero < count) {
				maxZero = count;
				temp = i;
			}

		}

		System.out.print(temp);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = { { 1, 1, 0 }, { 1, 1, 0 }, { 1, 1, 0 } };
		getMaxCol(matrix);

	}

}
