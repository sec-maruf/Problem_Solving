package matrixProblems;

import java.util.Scanner;

public class ReplaceDuplicateNumWithMax {
	public static void replaceDuplicateNumWithMax(int m[][]) {
		int array[] = new int[100];
		int count = 0;
		int count1 = 0;

		for (int row = 0; row < m.length; row++) {
			for (int col = 0; col < m[row].length; col++) {
				array[count] = m[row][col];
				count++;
			}
		}

		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				if (array[i] == array[j])
					array[j] = getMaxValFromMatrix(m);
			}
		}
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = array[count1];
				count1++;

			}
		}
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");

			}
			System.out.println();
		}

	}

	public static int getMaxValFromMatrix(int m[][]) {
		int max = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] > max) {
					max = m[i][j];
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		int rowLen = console.nextInt();
		int colLen = console.nextInt();
		int matrix[][] = new int[rowLen][colLen];

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				matrix[row][col] = console.nextInt();
			}
		}

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println("New matrix");
		replaceDuplicateNumWithMax(matrix);

	}

}
