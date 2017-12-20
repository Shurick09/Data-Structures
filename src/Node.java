/*
 *  Generic Class
 *  <T> placeholder for the type we wish to instantiate this class
 */
public class Node<T> {
	
	// Generic fields
	T data;		
	Node<T> next;
	
	// Constructor
	Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}
}
