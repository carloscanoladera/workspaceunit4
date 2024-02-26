package varargs;
public class VarArgsExample {
    // A method that takes variable 
    // number of integer arguments.
	

	
    static void fun(int... a)
    {
        System.out.println("Number of arguments: "
                           + a.length);
 
        // using for each loop to display contents of a
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
        
        
        for (int i= 0; i<a.length ; i++) {
        	
        	a[i]++;
        	
        }
    }
    
    
    //Method that takes and array as an argument
	 static void fun3(int[] a)
	    {
	    
	    }
	 
	 
	    // Check if num is in the listVarArgs, provided as second parameter
	 
	    // only can be one varargs argument per function and it must be at 
	    // the end of the arity. However you can place as many regular arguments 		
		// as you wishbefore the vararg parameter
		// 
		static boolean isInList(int num, int...listVarArgs) {
			boolean found=false;
			
			for (int i=0; i<listVarArgs.length &&!found ; i++) {
				
				if (listVarArgs[i]==num)
					found=true;
				
			}
			
			return found;
		}
    
 
    // Driver code
    public static void main(String args[])
    {
    	
    	int[] arrayNum = {1,3,4,6,7};
        // Calling the varargs method with 
        // different number of parameters
       
        // one parameter
        fun(100); 
     
           
          // four parameters
        fun(1, 2, 3, 4); 
        //fun3(1, 2, 3, 4);  
          // no parameter
          fun(); 
          
          fun3(arrayNum);
          
          fun(arrayNum);
          fun(arrayNum);
    }
}