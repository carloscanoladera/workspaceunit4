package arrays;


public class ArrayLiterales {

	public static void pintarArrayEnteros(int[] array) {

		for (int i = 0; i < array.length; i++) {

			if (i == array.length - 1)
				System.out.format("|%-4d|", array[i]);
			else
				System.out.format("|%-4d", array[i]);

		}

		System.out.println();

	}
	
	public static void pintarArrayEnteros(int[] array, int numFinal) {

		for (int i = 0;    i < array.length && array[i]!= numFinal ; i++) {

			if (i == array.length - 1)
				System.out.format("|%-4d|", array[i]);
			else
				System.out.format("|%-4d", array[i]);

		}

		System.out.println();

	}
	
	public static void pintarArrayCadenas(String[] array) {

		for (int i = 0;    i < array.length; i++) {

			if (i == array.length - 1)
				System.out.format("|%-20s|", array[i]);
			else
				System.out.format("%-20s|", array[i]);

		}

		System.out.println();

	}
	
	public static void pintarArrayCadenas(String[] array, String cadFinal) {

		for (int i = 0;    i < array.length && !array[i].equals(cadFinal)  ; i++) {

			if (i == array.length - 1)
				System.out.format("%-20s|", array[i]);
			else
				System.out.format("|%-20s|", array[i]);

		}

		System.out.println();

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrayDias = { 1, 2, 3, 4, 5, 6, 7 };
		char[] vocales = { 'a', 'b', 'c', 'd', 'e' };
		byte[] ipHost = { 2, 4, 127, 20, 12 };
		float[] temperaturas = { 20, 15.3f, 10, 30.2f, 12, 14, 12.5f };

		String[] arrayDias2 = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };

		pintarArrayEnteros(arrayDias);

		System.out.println("Longitud del array de dias:" + arrayDias2.length);

		System.out.println(arrayDias2[2]);

	}

}
