import java.util.NoSuchElementException;

/*
 * Binary Search Tree (BST)
 * Duplicates are not allowed
 * Comparable requires its objects to implement compareTo
 * 
 */
public class BST <T extends Comparable <T>> {
	
	BSTNode <T> root;
	int size;
	
	BST () {
		root = null;
		size = 0;
	}
	public void insert (T key) {
		// 1. Search until we fail
		BSTNode<T> ptr = root;
		BSTNode<T> prev = null;
		
		int c = 0;
		while (ptr != null) {
			c = key.compareTo(ptr.key);
			if (c==0) { // key and ptr.key are equal
				throw new IllegalArgumentException(key + " already in BST");
			}
			prev = ptr;
			if (c < 0) { //key is smaller than ptr.key
				ptr = ptr.left;
			} else {
				// key is greater than ptr.key
				ptr = ptr.right;
			}
		}
		// 2. Insert at the failure point
		BSTNode<T> node = new BSTNode<T> (key,null,null); // node is a leaf
		if (prev == null && ptr == null) {
			// empty tree
			root = node;
		} else if (c < 0) {
			prev.left = node;
		} else {
			prev.right = node;
		}
		size += 1;
	}
	public BSTNode<T> search (T key) {
		BSTNode<T> ptr = root;
		int c = 0;
		while (ptr != null) {
			c = key.compareTo(ptr.key);
			if (c == 0) {
				return ptr;
			} else if (c < 0) {
				ptr = ptr.left;
			} else {
				ptr = ptr.right;
			}
		}
		return null;
	}
	public static <T extends Comparable<T>> void inOrderTraversal (BSTNode<T> root) {
		if (root == null) {
			return;
		}
		inOrderTraversal(root.left);
		System.out.print(root.key + " " );
		inOrderTraversal(root.right);
	}
	public void delete (T key) {
		// 1. find node to delete
		BSTNode<T> p = null;
		BSTNode<T> x = root;
		int c = 0;
		while(x != null) {
			c = key.compareTo(x.key);
			if (c == 0) {
				break; // found the node to delete
			}
			p = x;
			x = (c < 0) ? x.left : x.right;
		}
		// 2. if key is not in the tree
		if (x == null) {
			throw new NoSuchElementException("Item not found");
		}
		// 3. case 3 (node with two children)
		BSTNode<T> y = null; // inorder predecessor
		if (x.left != null && x.right != null) {
			y = x.left;
			p = x;
			while (y.right != null) {
				p = y;
				y = y.right;
			}
			// copy y's data into x's data
			x.key = y.key;
			
			// prepare to delete y
			x = y;
		}
		// 4. check if x is the root
		if (p == null) {
			// root has only one child
			root = (x.left != null) ? x.left : x.right;
			return;
		}
		// 5. case 1 (leaf) and 2 (with one child)
		BSTNode<T> tmp = (x.right != null) ? x.right : x.left;
		if (x == p.left) {
			p.left = tmp;
		} else{
			p.right = tmp;
		}
	}
	
}
