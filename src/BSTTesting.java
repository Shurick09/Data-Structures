
public class BSTTesting {
	
	public static void main(String [] args) {
		
		BST<Integer> bst = new BST<Integer> ();
		bst.insert(20);
		bst.insert(10);
		bst.insert(5);
		bst.insert(15);
		bst.insert(13);
		bst.insert(25);
		bst.insert(30);
		bst.insert(26);
		BST.inOrderTraversal(bst.root);
		bst.delete(10);
		System.out.println();
		BST.inOrderTraversal(bst.root);
		
	}

}
