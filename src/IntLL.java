
public class IntLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntNode L = null;	// front of the LL
		L = addToFront(L,5);
		L = addToFront(L,4);
		L = addToFront(L,3);
		traverse(L);
		L = deleteFront(L); // L will be updated with the address of the second node
		traverse(L);
		L = addToFront(L,2);
		traverse(L);
		addAfter(L, 5, 6);
		addAfter(L, 2, 3);
		traverse(L);
	}
	public static IntNode delete(IntNode front, int target){
		IntNode ptr = front;
		IntNode prev = null;
		//prev is always one node behind ptr
		while (ptr != null && ptr.data != target) {
			prev = ptr;
			ptr = ptr.next;
		}
		if (ptr == null){
			return front; // target not found
		} else if (ptr == front){
			return front.next; // target is the front of the LL
		} else {
			prev.next = ptr.next;
			return front;
		}
	}
	public static void addAfter(IntNode front, int target, int data){
		IntNode ptr = front;
		// find the node that has target as data
		while (ptr != null && ptr.data != target) {
			ptr = ptr.next;
		}
		if (ptr != null) {
			// found target, ptr is pointing to it
			IntNode node = new IntNode(data, ptr.next);
			ptr.next = node;
		} else {
			System.out.println(target + "not found!");
		}
		
	}
	
	public static IntNode addToFront(IntNode front, int data) {
		IntNode node = new IntNode(data, front);
		return node;
	}
	public static IntNode deleteFront(IntNode front){
		return front.next; // front.next is the second node on the LL
	}
	
	public static void traverse (IntNode front){
		IntNode ptr = front; // reference to traverse the LL
		while (ptr != null) {
			System.out.print(ptr.data + " -> ");
			ptr = ptr.next; // update pointer to point to the next node
		}
		System.out.println("\\");
	}
}
