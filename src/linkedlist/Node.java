package linkedlist;

public class Node<E> {
	E data;
	Node<E> next;

	public Node(E data) {
		this.data = data;
		this.next = null;
	}

	public Node(E data, Node<E> next) {
		this(data);
		this.next = next;
	}

	public String toString() {
		if (next == null)
			return data.toString();
		else {
			return data.toString() + ", " + next.toString();
		}

	}
}
