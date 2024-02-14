package ejemplosenclase;

import java.util.Random;

public class LlenandoArraysDouble {

	public static void main(String[] args) {


		//Generando aleatorios
		
		Random rand = new Random();
		// entero aleatorio entre 0 y 20
		int enteroAleatorio = rand.nextInt(20);
		
		System.out.println(enteroAleatorio);
		//decimal entre 0 y 1
		double decimalAleatorio = rand.nextDouble();
		System.out.println(decimalAleatorio);
		
		//Como podemos hacer un aleatorio decimal entre 0 y 50
		
		double decimalAleatorio0y50 = rand.nextDouble()*50;
		System.out.println(decimalAleatorio0y50);
		
		
		
	}
	
	//Llenar el array con decimales aleatorios
	public static double[] llenarArrayDecimales(int numElementos, int maxDecimal) {
		
		double[]resultado = new double[numElementos];
		Random rand = new Random();
		// numero aleatorio entre 0 y maxdecimal que cambiarlo
		
		// rand.nextDouble() devuelve un decimal entre 0 y 1
		double decimalAleatorio = rand.nextDouble()*maxDecimal;
		
		
		for (int i=0 ; i<numElementos; i++) {
				
			resultado[i]=rand.nextDouble()*maxDecimal;
		
		}
		
		return resultado;
		
	}

}
