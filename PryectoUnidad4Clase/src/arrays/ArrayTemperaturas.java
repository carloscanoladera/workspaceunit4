package arrays;

import java.util.Locale;
import java.util.Random;




public class ArrayTemperaturas {
	
	
	public static void pintarArray(double[] array) {
		
		for (int i=0 ; i< array.length ; i++) {
			
			if (i==array.length-1)
				System.out.format(Locale.ENGLISH,  "|%-4.2f|", array[i] );
			else
				System.out.format(Locale.ENGLISH,"|%-4.2f", array[i]);
				
			}
		
		System.out.println();
		
	}	
	// paso por valor tipo primitivo. Hace una copia del valor de 
	// la variable pasada por valor
	public static void rellenarEntero(int x) {
		
		x=1;
	}
	// paso por referencia, pasamos la referencia al objeto array. El
	// array pasado al ser una referencia modifica los valores del array original
	// pasado como parámetro
	public static void rellenarConUnos(double[] array) {
		
		for (int i=0 ; i< array.length ; i++) {
			
			array[i]=1.0;
			
		}
				
	}	
	
	
	public static int[] creaArrayConNumerosAleatorios(int tam) {
		
		// puedo usar variables de tipo entero para asignar tamaño al array
		int[]array = new int[tam];
		
		
		//devuelvo la referencia al array
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double [] temperatures = new double[20];
		
		System.out.println("Longitud del array es siempre uno mas que el indice:" + temperatures.length);
		//Cuando paso un array como parámetro, paso su referencia
		//
		pintarArray(temperatures);
		
		rellenarConUnos(temperatures);
		pintarArray(temperatures);
		
		int z=0;
		//PAso por valor
		rellenarEntero(z);
		
		Random rd = new Random();
		
		char c ='d';
		String c2="er";

	}

}
