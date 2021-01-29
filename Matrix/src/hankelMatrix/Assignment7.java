package hankelMatrix;

public class Assignment7 {
	ListT1 list = new ListT1();

	public boolean checkHankelMatrix(int n, int m[][]) {

		int arr[];
		boolean check = true;
		for (int k = 0; k < n; k++) {
			int row = k;
			int col = 0;
			arr = new int[k + 1];
			int i = 0;
			while (row >= 0) {
				arr[i] = m[row][col];
				row = row - 1;
				col = col + 1;
				i++;
			}
			i = 0;
			list.addLast(arr);

		}
		for (int k = 1; k < m[0].length; k++) {
			int row = m.length - 1;
			int col = k;
			arr = new int[m[0].length - k];
			int i = 0;
			while (col < m[0].length) {
				arr[i] = m[row][col];
				row = row - 1;
				col = col + 1;
				i++;
			}
			i = 0;
			list.addLast(arr);
		}

		NodeT1 temp = list.head;
		while (temp != null) {
			for (int i = 0; i < temp.data.length - 1; i++) {
				if (temp.data[i] == temp.data[i + 1]) {
					check = true;
				} else {
					check = false;
				}
			}
			temp = temp.next;
		}
		return check;
	}

	public ListT2 hankelList(int m[][]) {

		Assignment7 assignment7 = new Assignment7();
		int n = m.length;
		boolean check = assignment7.checkHankelMatrix(n, m);
		int arr[] = new int[list.linkedListLen()];
		NodeT1 temp = list.head;
		ListT2 hankelList = new ListT2();
		if (check == true) {
			int i = 0;
			while (temp != null) {

				int avg = 0;
				int sum = 0;
				for (int j = 0; j < temp.data.length; j++) {
					sum = sum + temp.data[j];
				}
				avg = sum / temp.data.length;
				arr[i] = avg;
				sum = 0;
				avg = 0;
				i++;
				temp = temp.next;

			}

			for (int j = 0; j < arr.length; j++) {
				int t_val = 0;
				for (int k = 0; k < arr.length - 1; k++) {
					if (arr[k] > arr[k + 1]) {
						t_val = arr[k];
						arr[k] = arr[k + 1];
						arr[k + 1] = t_val;
					}

				}

			}

			for (int j = 0; j < arr.length; j++) {
				hankelList.addLast(arr[j]);
			}

		} else {

			hankelList.head = null;
		}

		return hankelList;

	}

	public static void main(String[] args) {
		int m[][] = { { 1, 2, 3, 5 }, { 2, 3, 5, 8 }, { 3, 5, 8, 0 }, { 5, 8, 0, 9 } };
		int n = m.length;
		// int m[][] = { { 1, 2, 3 }, { 2, 3, 5 }, { 3, 9, 8 } };
		// int n = m.length;
		Assignment7 a7 = new Assignment7();
		System.out.println(a7.checkHankelMatrix(n, m));
		a7.hankelList(m).printContent();

	}
}
