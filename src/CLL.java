
public class CLL <T> {
	
	private Node <T> tail; // points to the last element of the CLL
	private int size;
	
	// constructor initialize the CLL to an empty one
	public CLL () {
		tail = null;
		size = 0;
	}
	
	public void addTooFront (T data) {
		
		Node<T> node = new Node<T>(data, null);
		if (tail == null) {
			/* empty CLL */
			node.next = node;
			tail = node;
		} else {
			node.next = tail.next;
			tail.next = node;
		}
		size += 1;
	}
	/*
	 * Best Case: target is the first element 0(1)
	 * Worst Case: target is not found or is 
	 */
	
	
	public Node<T> search (T target) {
		Node<T> ptr = tail.next;
		do {
			if (ptr.data.equals(target)) {
				return ptr;
			} else {
				ptr = ptr.next;
			}
		} while (ptr != tail.next);
		System.out.println(target + " not found");
		return null;
	}
	/*
	 * O(1)
	 */
	public void deleteFront () {
		if (tail == tail.next) {
			// CLL has only one element
			tail = null;
			size = 0;
		} else {
			// tail should point to the second element
			tail.next = tail.next.next;
			size -= 1;
		}	
	}
}

