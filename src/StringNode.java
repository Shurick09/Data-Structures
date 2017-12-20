/*
 * Blueprint of the object StringNode
 */
public class StringNode {
	// Object's fields
	String data; // reference to a string
	StringNode next; // reference to the next node
	
	// Constructor initializes the object
	StringNode(String data, StringNode next) {
		this.data = data;
		this.next = next;
	}
}
