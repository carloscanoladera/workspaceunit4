package ejemplosenclase;

import java.util.Scanner;

public class LLenandoArrays {
	
	
	public static void main(String[] args) {
		
	float [] array = new float[10];
		//llenando con bucle for
	
	for (int i=0; i<array.length ; i++) {
		
		
		array[i]= i*3f/2f;
		
		//3/2 java se piensa que es un entero
		// 3.0/2.0 se piensa que es un double
		// 3f/2f se piensa que es un float
	}
	
	
	// haced un bucle for para mostrar el array por pantalla
	
	
	for (int i=0; i<array.length; i++) {
		if (i==array.length-1)				
			System.out.print(array[i]);			
		else
			System.out.print(array[i] + ", ");
		
	}
	
	
	//
	
	Scanner sc = new Scanner(System.in);
	String [] nombres= new String[7];
	
	//Llenar el array con un bucle pidiendo nombres por pantalla
	
	for (int i=0; i<nombres.length; i++) {
		
		System.out.println("Introduce un nombre: ");
		String nombre = sc.next();
		
		nombres[i]= nombre;
		
	}
	
	//Mostrar por pantalla el array de nombres
	
	for (int i=0; i<nombres.length; i++) {
	
		
		
	}
	
		
	}

}
