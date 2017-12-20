/*
 *  Object-oriented String Linked List
 */
public class StringLL {
	
	//Fields
	StringNode front; // reference to the front of the LL
	int size;
	
	StringLL() {
		front = null; // LL is empty
		size = 0;
	}
	public void addToFront(String data) {
		front = new StringNode(data, front);
		size++;
	}
	public void traverse() {
		System.out.printf("The linked list has %d nodes\n", size);
		for (StringNode ptr = front; ptr != null; ptr = ptr.next) {
			System.out.printf("%s -> ", ptr.data);
		}
		System.out.printf("\\ \n");
	}
	
	public StringNode search(String target) {
		
		for (StringNode ptr = front; ptr != null; ptr = ptr.next){
			if (ptr.data.equals(target)) {
				return ptr;
			}
		}
		return null;
	}
}
