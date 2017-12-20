
public class BSTNode <T> {
	
	T key;
	BSTNode<T> left; // left subtree
	BSTNode<T> right; // right subtree
	
	BSTNode (T key, BSTNode<T> left, BSTNode<T> right) {
		this.key = key;
		this.left = left;
		this.right = right;
	}

}
