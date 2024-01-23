package arrays;

public class OperacionesConArrays {

	public static boolean arrayIguales(String[] array1, String[] array2) {

		boolean resultado = true;

		if (array1.length != array2.length) {
			resultado = false;

		} else {
			for (int i = 0; i < array1.length; i++) {

				if (!array1[i].equals(array2[i])) {
					resultado = false;
					break;
				}
			}
		}
		return resultado;

	}
	
	
	public static String [] copiaArray(String[] array) {
	String[] arrayCopiado = new String[array.length];

	for (int i = 0; i < array.length; i++) {

		arrayCopiado[i] = array[i];
	}
	return arrayCopiado;
	
	}

	public static void muestraArray(String[] array) {

		for (String s : array) {

			System.out.print(s + "|");
		}

		System.out.println();
	}

	public static String[] modificaArray(String[] array) {

		String[] arrayModificado = new String[array.length];

		for (int i = 0; i < array.length; i++) {

			arrayModificado[i] = array[i] + " Modificado ";
		}
		return arrayModificado;
	}

	public static void main(String[] args) {

		String arrayString[] = { "Cadena 1", "Cadena 2", "Cadena 3", "Cadena 4" };

		String arrayString3[] = { "Cadena 1", "Cadena 2", "Cadena 3", "Cadena 4" };
		String arrayString2[];

		arrayString2 = arrayString.clone();
		
	
		System.out.println("Mostramos arrayString");
		OperacionesConArrays.muestraArray(arrayString);

		System.out.println("Mostramos arrayString2");
		OperacionesConArrays.muestraArray(arrayString2);

		
				// equals NO FUNCIONA PROBARLO
				// CAMBIARLO POR EL METODO QUE HEMOS CREADO
			
		
		if (arrayString.equals(arrayString2)) {

			System.out.println("arrayString y arrayString2 son iguales con equals");

		} else {

			System.out.println("arrayString y arrayString2 son distintos con equals");
		}
		
		
		if (OperacionesConArrays.arrayIguales(arrayString, arrayString2)) {

			System.out.println("arrayString y arrayString2 son iguales con nuestro método");

		} else {

			System.out.println("arrayString y arrayString2 son distintos con nuestro método");
		}

		arrayString2 = OperacionesConArrays.modificaArray(arrayString);
		System.out.println("Mostramos arrayString2 despues de modificarlo con el método modificaArray");
		OperacionesConArrays.muestraArray(arrayString2);

		if (OperacionesConArrays.arrayIguales(arrayString, arrayString2)) {

			System.out.println("arrayString y arrayString2 son iguales");

		} else {

			System.out.println("arrayString y arrayString2 son distintos");
		}
	}

}
