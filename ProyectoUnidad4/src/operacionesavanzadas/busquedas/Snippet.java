package operacionesavanzadas.busquedas;

public class Snippet {
	public static int binarySearch(int item, int[] list) {
			// if index = -1 when the method has finished
			// is that we haven't  found  the 
			int index = -1;
			// We initialize the initial and final  index of the array 
	
			int left = 0;
			int right = list.length - 1;
			int center;
			// We continued the search until we found it
			// The until Der and Izq intersect
			while (right >= left) {
				center = (right + left) / 2;// We calculate the midpoint
				if (item < list[center]) { // The value is on the left side //of the array or lower
					right = center - 1;
				} else if (item > list[center]) {
					// The value is on the right side of the array
					left = center + 1;
				} else {
					// found we got out of the loop
					index = center;
					break;
				}
			}
			return index;
		}
	
}

