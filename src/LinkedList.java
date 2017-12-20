import java.util.NoSuchElementException;

public class LinkedList <T> {
	
//fields
	Node <T> front;
	int size;
	
	
	LinkedList() {
		front = null;
		size = 0;
	}
	public void addToFront (T data) {
		front = new Node<T>(data, front);
		size++;
	}
	public void traverse() {
		System.out.printf("Linked list has %d nodes\n", this.size);
		for(Node<T> ptr = front; ptr != null; ptr = ptr.next) {
			System.out.print(ptr.data + " -> ");
		}
		System.out.println("\\");
	}
	public T deleteFront() {
		
		if (front == null) {
			throw new NoSuchElementException("List is empty");
		}
		
		T temp = front.data;
		front = front.next;
		size--;
		return temp;
	}
	
	public IntNode commonElements(IntNode frontL1, IntNode frontL2) {
		IntNode frontL3 = new IntNode(0,null);
		for (IntNode ptr = frontL1; ptr != null; ptr = ptr.next) {
			IntNode ptr2 = frontL2;
			while (ptr2 != null) {
				if (ptr.data == ptr2.data) {
					frontL3.data = ptr.data;
				}
				ptr2 = ptr2.next;
			}
		}
		return frontL3;
	}
}
