package iesjandula.unit4project.matrices.exercises;

public class Problem52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] A = 
			{ {1,2},
			{3,4}
				
		};
		
		int[][]B = {
				
				{1,1},
				{1,1}
				
				
		};

		
		int [][]suma = new int[2][2];
		
		int [][]multiplicacion = new int[2][2];
		// hacer la suma con recurrido por filas
		
		for (int i=0 ; i <A.length ; i++) {
			
			for(int j=0 ; j <A[i].length; j++) {
				
				
				suma[i][j]=A[i][j] + B[i][j];
				
			}
		}
		
		
		// Deberes
		
		
		
		// hacer la suma con recorrido por columnas
		
		
		
		// hacer la multiplicacion con recurrido por filas
		
		for (int i=0 ; i <A.length ; i++) {
			
			for(int j=0 ; j <A[i].length; j++) {
				
				
				//multiplicacion[i][j]
				
			}
		}
		
		
	
		
	}

}
