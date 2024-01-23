package ejemplosprevacaciones;

import java.util.Arrays;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;



public class IntroduccionALambdas {
	
	public static double operacion(BiFunction<Double,Double,Double> operacion,
			double op1, double op2) {
		return operacion.apply(op1,op2); 
	}
	public static double resta(double op1, double op2) {
		
		return op1-op2;
	}
	
	public static double[] arrayAleatorios(int tam, int max) {
		
		double[] resultado = new double[tam];
		Random rand = new Random();
		
		for (int i=0; i<resultado.length; i++) {
			
			resultado[i]= rand.nextDouble()*max;
		}
		
		return resultado;
		
	}
	
	public static void mostrarArrayDoubleLambda(double[] arrayParam) {
		
		Arrays.stream(arrayParam).forEach((num)->System.out.print(num+",") );
		System.out.println();
		
	}
	
	
	public static void mostrarArrayDouble(double[] array) {		
		
		
		for (int i=0; i<array.length; i++) {
			if (i==array.length-1)				
				System.out.print(array[i]);			
			else
				System.out.print(array[i] + ", ");
			
		}
		
		System.out.println();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Function<Integer,Integer> lambda= (x) -> x+2;
				
		System.out.println(lambda.apply(2));
				
		System.out.println("suma" + operacion((x,y)-> x+y, 6, 7 ));
		
		System.out.println("resta" + operacion(IntroduccionALambdas::resta,7,-4));
		
		System.out.println("división" + operacion((x,y)-> x/y, 9, -1.4 ));
		
		
		
			double [] arrayDo= arrayAleatorios(100, 50);
			
			mostrarArrayDouble(arrayDo);
			mostrarArrayDoubleLambda(arrayDo);
			
			double [] arrayRes =Arrays.stream(arrayDo).filter((x)->x<10).toArray();
		
			Arrays.stream(arrayDo).average();
			Arrays.stream(arrayDo).filter((x)->x>10).average().getAsDouble();
			Arrays.stream(arrayDo).max().getAsDouble();
			Arrays.stream(arrayDo).summaryStatistics();
		
	}

}
