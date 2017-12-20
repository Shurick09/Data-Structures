
public class DLL<T> {
	
	DLLNode front;
	int size;
	
	public DLL () {
		front = null;
		size = 0;
	}
	public void addToFront(T data) {
		DLLNode<T> node = new DLLNode(data, null, front);
		if (front != null) {
			front.previous = node;
			
		}
		front = node;
		size += 1;
	}
	public void addAfter(T data, T target) {
		DLLNode ptr = front;
		while (ptr != null && !ptr.data.equals(target)) {
			ptr = ptr.next;
		}
		if (ptr == null) {
			System.out.println("Item not found");
			return;
		} else {
			DLLNode node = new DLLNode(data, ptr, ptr.next);
			if (ptr.next != null) {
				// ptr is not the last element in the LL
				ptr.next.previous = node;
			}
			ptr.next = node;
			size += 1;
		}

	}
	public T delete (T target) {
		DLLNode ptr = front;
		while (ptr != null && !ptr.data.equals(target)) {
			ptr = ptr.next;
		}
		if (ptr != null) {
			// found target
			T tmp = (T) ptr.data;
			if (ptr.previous == null && ptr.next == null) {
				front = null;
				size -= 1;
				return tmp;
			}
			if (ptr == front) {
				ptr.next.previous = null;
				front = ptr.next;
			}
			if (ptr.previous != null) {
				ptr.previous.next = ptr.next;
			}
			if (ptr.next != null) {
				ptr.next.previous = ptr.previous;
			}
			size -=1 ;
			return tmp;
		}
		return null;
	}
	public void traverse() {
		DLLNode ptr = front;
		while (ptr != null) {
			System.out.print(ptr.data + " -> ");
			ptr = ptr.next;
		}
		System.out.println("\\"); 
	}
}
