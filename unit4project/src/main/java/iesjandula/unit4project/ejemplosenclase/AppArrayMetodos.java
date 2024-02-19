package iesjandula.unit4project.ejemplosenclase;

public class AppArrayMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arrayInteger = ArrayMetodos.rellenaArrayAleatorios(20, 50);
		
		
		ArrayMetodos.mostrarArray(arrayInteger);
		
		int[] arrayRevertido = ArrayMetodos.revierteArray(arrayInteger);
		
		ArrayMetodos.mostrarArray(arrayRevertido);
		
		
		Double[] arrayWrapDouble = ArrayMetodos.rellenaArrayAleatoriosWrap(20, 55.0);
		
		ArrayMetodos.mostrarArray(arrayWrapDouble);
		
		ArrayMetodos.revierteArray(arrayWrapDouble);
		
		ArrayMetodos.mostrarArray(arrayWrapDouble);
		
		Double max = ArrayMetodos.maxInArray(arrayWrapDouble);
		
		System.out.println("Maximo: " + max);
		
		Integer[] arrayWrapInteger = ArrayMetodos.rellenaArrayAleatoriosWrap(20, 30);
		
		
		Integer min = ArrayMetodos.minInArray(arrayWrapInteger);
		
		System.out.println("Minimo: " + min);
		
		
		String[] arrayString = ArrayMetodos.combinaArrays(arrayWrapDouble, arrayWrapInteger);
		
		ArrayMetodos.mostrarArray(arrayString);
		
	}

}
