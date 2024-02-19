package iesjandula.unit4project.ejercicios.eningles.exercise24;

public class Exercise24 {
	
	
	private int getNumEvenNumbersInArray(Integer[] array) {
		
		int contEven=0;
		
		for (Integer item: array) {
			
			if (item%2==0)
				contEven++;
			
		}
		
		return contEven; 
	}
	
	public Integer[] evenArray(Integer[] array1, Integer[] array2) {
		
		int contEven=0;
		
		int tamArrayRes = getNumEvenNumbersInArray(array1) +getNumEvenNumbersInArray(array2);
		Integer[] arrayResul = new Integer[tamArrayRes];
		
		for (Integer item: array1) {
			
			
			if (item%2==0) {
				
				arrayResul[contEven]=item;
				contEven++;
			}
			
		}

		for (Integer item: array2) {
			
			
			if (item%2==0) {
				
				arrayResul[contEven]=item;
				contEven++;
			}
			
		}
		
		return arrayResul;
		
	}
	// the same as evenArray but with odd numbers
	public Integer[] oddArray(Integer[] array1, Integer[] array2) {
		Integer[] arrayResul = {0,1};
		
		return arrayResul;
		
	}

}
