public class BinarySearch {

	/* 
	 * Iterative binary search
	 */
	public static int binarySearch(int[] A, int target) {
		int low = 0;
		int high = A.length - 1;
		
		while ( low <= high ) {
			int middle = ( low + high ) / 2;
			
			if ( A[middle] == target ) {
				return middle; // found it
			} else {
				if ( A[middle] < target ) {
					low = middle + 1;
				} else {
					high = middle - 1;
				}
			}
		}
		return -1; // not found
	}
	
	/*
	 * Recursive binary search 
	 */
	public static int rBinarySearch (int[] A, int target, int low, int high) {
		if ( low > high ) {
			return -1;
		}
		int middle = ( low + high ) / 2;
		if ( A[middle] == target ) {
			return middle;
		} else {
			if ( A[middle] < target ) {
				return rBinarySearch(A, target, middle+1, high);
			} else {
				return rBinarySearch(A, target, low, middle-1);
			}
		}
	}
	
	public static int rBinarySearch (int[] A, int target) {
		return rBinarySearch(A, target, 0, A.length-1);
	}
	
	public static void main (String[] args) {
		int[] array = {3, 10, 20, 53, 70, 99};
		System.out.println(binarySearch(array, 53));
		System.out.println(binarySearch(array, 55));
		System.out.println(rBinarySearch(array, 10));
		System.out.println(rBinarySearch(array, 100));
	}
}