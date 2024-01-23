package arrays;

import java.util.Scanner;

public class ArrayTemperaturasVersion2 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Para cuantos dias tomamos datos de temperatura? ");
		int numDias = console.nextInt();
		int next = 0;
		float arrayDias[] = new float[numDias];
		int sum = 0;
		for (int i = 0; i < numDias; i++) {
			System.out.print("Dia " + ( i + 1) + ", Introduce la Temperatura mas alta ");
			next = console.nextInt();
			arrayDias[i] = next;
			sum += next;
		}

		double media = (double) sum / numDias;
		System.out.println();
		System.out.println("Media de temperatura = " + media);
		
		float maximo=0;
		int contarDias=0;
		for (int i=1 ; i< numDias ; i++) {
			
			
			if (maximo < arrayDias[i] ) 
				maximo= arrayDias[i];
			
			if (arrayDias[i]<20) 
					contarDias++;
		}
		
		System.out.println("El maximo de temperaturas de todos los dias es: " + maximo);
		

	}
}
