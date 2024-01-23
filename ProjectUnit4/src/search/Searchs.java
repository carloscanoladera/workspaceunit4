package search;

public class Searchs {

	public static int sequentialSearch(int item, int[] list) {
		// if index = -1 when the method has finished
		// is that we haven't found the
		int index = -1;
		// We traverse the array with a loop
		for (int i = 0; i < list.length; i++) {
			if (list[i] == item) {
				index = i;
				break;
			}
		}
		return index;
	}

	public static int binarySearch(int item, int[] list) {
		// if index = -1 when the method has finished
		// is that we haven't found the
		int index = -1;
		// We initialize the initial and final index of the array

		int left = 0;
		int right = list.length - 1;
		int middle;
		// We continued the search until we found it
		// The until Der and Izq intersect
		while (right >= left) {
			middle = (right + left) / 2;// We calculate the midpoint
			if (item < list[middle]) { // The value is on the left side //of the array or lower
				right = middle - 1;
			} else if (item > list[middle]) {
				// The value is on the right side of the array
				left = middle + 1;
			} else {
				// found we got out of the loop
				index = middle;
				break;
			}
		}
		return index;
	}

	public static void main(String[] args) {

		int[] arraySorted = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23 };

		System.out.println("Sequential search 19 element index: " + sequentialSearch(19, arraySorted));

		System.out.println("Bynary Search 19 element index: " + binarySearch(19, arraySorted));

	}

}
