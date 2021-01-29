package hankelMatrix;

public class ListT1 {
	NodeT1 head;

	public boolean isEmpty() {
		return head == null;
	}

	public ListT1() {
		this.head = null;
	}

	public void addFirstAtList(int data[]) {
		NodeT1 newNode = new NodeT1(data);
		newNode.next = head;
		head = newNode;
	}

	public void printContent() {
		NodeT1 temp = head;
		while (temp != null) {
			System.out.print("{");
			for (int i = 0; i < temp.data.length; i++) {
				if (i == temp.data.length - 1) {
					System.out.print(temp.data[i]);
				} else {
					System.out.print(temp.data[i] + ",");
				}

			}
			System.out.print("}");
			temp = temp.next;

		}

	}

	public int linkedListLen() {
		NodeT1 temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;

		}
		return count;

	}

	public void addLast(int data[]) {
		NodeT1 temp = head;
		NodeT1 newNode = new NodeT1(data);
		if (isEmpty()) {
			head = newNode;
		} else {

			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	public void removeAtFront() {

		if (!this.isEmpty()) {
			head = head.next;
		}

	}

}
