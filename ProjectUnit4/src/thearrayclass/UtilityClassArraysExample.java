package thearrayclass;
import java.util.Arrays;

public class UtilityClassArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int intArr[] = { 10, 20, 15, 22, 35 };
		int intArr1[] = { 10, 15, 22 };
		  
    
        
        int intKey = 22;
        
       
        System.out.println(
            intKey + " element found at the index  = "
            + Arrays.binarySearch(intArr, intKey));
        
        
    
        
        System.out.println(
            intKey
            + " element found at the index = "
            + Arrays
                  .binarySearch(intArr, 1, 3, intKey));
        
        
        System.out.println("intArray to compare: " + Arrays.toString(intArr)); 
        
        System.out.println("intArray1 to compare: " + Arrays.toString(intArr1)); 
        
        // To compare both arrays
        System.out.println("Comparing both arrays: "
                           + Arrays.compare(intArr, intArr1));
        
     // To compare both arrays
        System.out.println("Comparing both arrays unsigned: "
                           + Arrays.compareUnsigned(intArr, intArr1));
        
       
        
        
        int[] intArray2 = Arrays.copyOf(intArr, 10);
        
        System.out.println("intArray2 copied: "
                           + Arrays.toString(
                        		   intArray2
                                 ));
        int[] intArrRelleno= new int[20];
        
        Arrays.fill(intArrRelleno, 0);
        
        // To fill the arrays
        System.out.println("Integer array filled up: "
                           + Arrays.toString(intArrRelleno));
        
        
// sorting with range
        
        Arrays.sort(intArr,2,4);
        
   
        System.out.println("sorted array from index 2 to 4: "
                           + Arrays.toString(intArr));
        
        // sorting
        
        Arrays.sort(intArray2);
        
 
        System.out.println("sorted array: "
                           + Arrays.toString(intArray2));

        
        
	}

}
