package hankelMatrix;

public class NodeT2 {
	int data;
	NodeT2 next;

	public NodeT2(int data) {
		this.data = data;
		next = null;
	}

	public String toString() {

		return "[" + this.data + "]";
	}

}
