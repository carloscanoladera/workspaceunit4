package ejemplosenclase;

import java.util.Scanner;

public class LlenandoArrays2 {
	
	
	
	public static float[] devuelveEntero() {
		
		float [] resultado= {3f,3.2f, 4.5f};
		
		//longitud del array 3
		
		// indice más pequeño 0		
		resultado[0]= 5.7f;
		
		// indice mas grande 2
		resultado[2] = 3.4f;
		
		
		return resultado;
	}
	
	public static void main(String[] args) {
		
		int [] array = arraynEnteros(42);
		
		int [] array2 = arraynEnteros(45);
				
		int [] resultado = sumaArrays(array, array2);
		
		int [] resultadoOpuestos= sumaOpuestosMejorado(array);
				
		
		mostrarArray(resultadoOpuestos);
		rellenaConCeros(resultadoOpuestos);
		mostrarArray(resultadoOpuestos);
		
		
	}

	//Devuelve un array de n enteros de 0 a n-1
	public static int[] arraynEnteros (int n) {
		
		int [] resultado = new int[n];
		
		for (int i=0; i<n ; i++) {
			
			resultado[i]=i;
			
		}
		
		return resultado;
	}
	
	public static int[] sumaOpuestos(int[] array) {
		
		int[] resultado = new int[array.length];
		
		
	
		for (int i=0; i<resultado.length ; i++) {
			
;
			resultado[i] = array[i]+ array[resultado.length-1-i];
			
			
		}
		
		
		return resultado;
	}
	
	
	
	public static int[] sumaOpuestosMejorado(int[] array) {
		
		int[] resultado = new int[array.length];
		
		
		
		int ultimaIteracion = 0;
		
		// si es par llegamos hasta la mitad
		if (resultado.length % 2==0)		
			ultimaIteracion= resultado.length/2;
		else
			// Si es impar la longitud hasta la mitad mas 1
			ultimaIteracion= resultado.length/2 + 1;
		
		int suma=0;
	
		for (int i=0; i<ultimaIteracion ; i++) {
			
			//el de delante
			//length 8
			//i=1
			//resultado[1] = array[1] + array[6]
			
			suma =array[i]+ array[resultado.length-1-i];
			resultado[i] = suma;
			
			//el de detras
			// resultado[6] = array[6] + array[1]
			resultado[resultado.length-1-i] = suma;
		}
		
		
		return resultado;
	}
	
	// devuelve el array de la serie de fibonacci
	public static int[] arrayFibonacci (int n) {
	int [] resultado=new int[n+1];
	
	
	rellenaConCeros(resultado);
	resultado[0]=1;
	resultado[1]=1;
	
	
	for ( int i=2 ; i<resultado.length ; i++ ) {
		
		//resultado[i]=
		
	}
	
	
		
	return resultado;
	}
	
	// rellena el array recibido todo a ceros
	public static void rellenaConCeros(int[] array) {
		
		
		for (int i=0; i<array.length ; i++) {
			
			
			array[i]=0;
		}
		
	}
	
	
	
	//mostrar un array de numeros por pantalla
	
	public static void mostrarArray(int[] array) {		
		
		
		for (int i=0; i<array.length; i++) {
			if (i==array.length-1)				
				System.out.print(array[i]);			
			else
				System.out.print(array[i] + ", ");
			
		}
		
		System.out.println();
		
		
	}
	
	
	//metodo que sume dos arrays
	// 5 6 7 8 array1
	// 4 8 9 12 34 array2
	
	// 9 14 16 20 34 suma
	
	public static int[] sumaArrays(int[] array1, int [] array2) {
		int [] resultado;
		int maxTam = Math.max(array1.length, array2.length);
		int elem1,elem2=0;
		resultado = new int[maxTam];
		
		for (int i=0; i<maxTam; i++) {
			elem1=0;
			elem2=0;
			
			if (i<array1.length) {
				 
				elem1= array1[i];
			}
			
			if (i<array2.length) {
				 
				elem2= array2[i];
			}
			
			resultado[i]= elem1+elem2;
		}
			
		return resultado;
	}
	
	// llenar un array con l n primeros numeros pares
	// Deberes para casa
	// Haced con un while que cuente sólo los pares
	public static int[] arrayPares(int n) {
		int [] resultado;
		resultado = new int[n];
		
		
		return resultado;
	}
	
	
}
