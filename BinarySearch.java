/* Binary Search */

public class BinarySearch {

	// This function returns the index of the given key
	// Runtime & Memory Complexity: O(log n)
	public static int BinarySearch (int[] A, int key) {

		int beg = 0; 
		int mid = A.length/2;
		int end = A.length-1; 
		boolean found = false;


	    if (A == null) { return -1; } 

		while (found!=true) {

			if (key > A[mid]) {

				beg = mid;
				mid = (end+beg)/2;


			}

			if (key < A[mid]) {

				end = mid;
				mid = (mid-beg)/2;


			}

			if (key == A[mid]) {

				found = true; 
			}
		}

		if (found == true) {return mid;}
		else return -1;
	}



	public static void main (String[] args) {


		int[] test1 = {1,10,20,47,59,75,88,99,107};
		int key1 = 47; 
		System.out.println(BinarySearch(test1,key1));




	}
}