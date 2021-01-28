package matrixProblems;

import java.util.Scanner;

public class RankOfMatrix {
	public static void getRankOfMat(int matrix[][]) {

		int x = (matrix[0][0] * ((matrix[1][1] * matrix[2][2]) - (matrix[1][2] * matrix[2][1])));
		int y = (matrix[0][1] * ((matrix[1][0] * matrix[2][2]) - (matrix[1][2] * matrix[2][0])));
		int z = (matrix[0][2] * ((matrix[1][0] * matrix[2][1]) - (matrix[2][0] * matrix[1][1])));
		int det = x - y + z;

		if (det > 0 || det < 0) {
			System.out.println("Rank:" + 3);
		}

		else if (det == 0) {
			int p = (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
			int q = (matrix[0][1] * matrix[1][2]) - (matrix[1][1] * matrix[0][2]);
			int r = (matrix[1][0] * matrix[2][1]) - (matrix[1][1] * matrix[2][0]);
			int s = (matrix[1][1] * matrix[2][2]) - (matrix[2][1] * matrix[1][2]);

			if (p != 0 || q != 0 || r != 0 || s != 0) {

				System.out.println("Rank:" + 2);
			}

			else {

				int c = 0;
				for (int i = 0; i < 3; i++) {

					for (int j = 0; j < 3; j++) {

						if (matrix[i][j] != 0) {
							System.out.println("Rank:" + 1);
							c++;
							break;
						}
					}
				}

				if (c == 0) {
					System.out.print(c);
				}

			}

		} else {
			System.out.println("Invalid value");
		}

	}

	public static void main(String[] args) {

		int matrix[][] = new int[3][3];

		Scanner userInput = new Scanner(System.in);
		int testCase = userInput.nextInt();

		for (int i = 0; i < testCase; i++) {

			for (int j = 0; j < matrix.length; j++) {
				for (int k = 0; k < matrix.length; k++) {
					matrix[j][k] = userInput.nextInt();

				}

			}

			getRankOfMat(matrix);
		}

	}

}
