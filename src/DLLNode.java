
public class DLLNode <T> {
	
	 T data;
	 DLLNode<T> previous; // link to the previous node
	 DLLNode<T> next; // link to the next node
	
	// constructor
	public DLLNode (T data, DLLNode<T> previous, DLLNode<T> next) {
		this.data = data;
		this.previous = previous;
		this.next = next;
	}
}
