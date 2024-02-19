package iesjandula.unit4project.ejemplosenclase;

import java.util.Random;

public class MiPrimerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// con asignacion y valores
		// creo un array de 7 elementos
		int edadllenado[] = { 15, 16, 15,  7,  12, 13, 18 };
				// indice     0    1  2    3   4   5   6   7
				
				//lenght longitud 7
		// array reservando memoria
		// todos los valores estan a cero
		int edad[] = new int[6];
		
		Random rand = new Random () ;
		
		int numEntre0y20= rand.nextInt(20);
		
		System.out.println(edadllenado[3]);
		System.out.println("Longitud del array: " + edadllenado.length);
		
		//Mostrar todos los elementos del array
		
		for (int i=0; i<edadllenado.length; i++) {
			//ultimo elemento del array es edadllenado.length -1 = 7-1 = 6
			// si es el ultimo elemento no escribimos coma ","
			if (i==edadllenado.length-1)				
				System.out.print(edadllenado[i]);			
			else
				System.out.print(edadllenado[i] + ", ");
			
		}
		
		// Mostrar todos los elementos del array al reves de final a principio
		System.out.println("\nImprimir el array al reves");
		
		
		for (int i= edadllenado.length -1; i>=0; i--) {
			
			if (i==0)				
				System.out.print(edadllenado[i]);			
			else
				System.out.print(edadllenado[i] + ", ");
		}
		
		// Empezando por en medio
		
		// 15, 16, 15, 7, 12, 13, 18
		
		// empezar por (edadllenado.length-1)/2 =6/2= 3
		// edadllenado[2]=15
		// vamos a ir hacia delante y hacia atrás a la vez
		// 7  12   15  13  16   18  15
		// 3   4   2   5    1   6   0  
		// bucle while
		// dos contadores, uno para ir hacia delante y otro
		// para ir hacia atrás
		// EXPLICAR PORQUE FALLA Y ARREGLARLO
		// DEPURARLO Y FIJAOS EN LA CONDICIÓN QUE SE TIENE QUE QUEDAR
		// IGUAL
		// edadllenado[7] -> outofbounds
		
		
		int contadordelante= (edadllenado.length-1)/2 +1;
		int contadoratras = (edadllenado.length-1)/2;
		// Mostrar todos los elementos del array al reves desde el medio
		System.out.println("\nImprimir el array desde el medio");
				
		while (contadordelante<edadllenado.length-1 ||
				contadoratras>=0 ) {
						
			System.out.print(edadllenado[contadoratras]+", ");
			if (contadordelante<edadllenado.length)
				System.out.print(edadllenado[contadordelante] + ", ");
			contadoratras--;
			contadordelante++;			
			
		}
		
		
		
		
		
		
		
		

	}

}
