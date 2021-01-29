package hankelMatrix;

public class ListT2 {
	NodeT2 head;

	public boolean isEmpty() {
		return head == null;
	}

	public ListT2() {
		this.head = null;
	}

	public void addFirstAtList(int data) {
		NodeT2 newNode = new NodeT2(data);
		newNode.next = head;
		head = newNode;
	}

	public void printContent() {
		NodeT2 temp = head;
		if (temp == null) {
			System.out.println(temp);
		}
		while (temp != null) {
			System.out.print(temp.toString());
			temp = temp.next;
		}

	}

	public void addLast(int data) {
		NodeT2 temp = head;
		NodeT2 newNode = new NodeT2(data);
		if (isEmpty()) {
			head = newNode;
		} else {

			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	public int linkedListLen() {
		NodeT2 temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;

		}
		return count;

	}

	public void removeAtFront() {

		if (!this.isEmpty()) {
			head = head.next;
		}

	}

}
