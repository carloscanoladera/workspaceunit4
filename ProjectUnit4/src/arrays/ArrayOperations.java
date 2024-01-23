package arrays;

public class ArrayOperations {

	public static boolean arrayEquality(String[] array1, String[] array2) {

		boolean result = true;

		if (array1.length != array2.length) {
			result = false;

		} else {
			for (int i = 0; i < array1.length; i++) {

				if (!array1[i].equals(array2[i])) {
					result = false;
					break;
				}
			}
		}
		return result;

	}

	public static String[] arrayCopy(String[] array) {
		String[] copiedArray = new String[array.length];

		for (int i = 0; i < array.length; i++) {

			copiedArray[i] = array[i];
		}
		return copiedArray;

	}

	public static void displayArray(String[] array) {

		for (String s : array) {

			System.out.print(s + "|");
		}

		System.out.println();
	}

	public static String[] modifyArray(String[] array) {

		String[] modifiedArray = new String[array.length];

		for (int i = 0; i < array.length; i++) {

			modifiedArray[i] = array[i] + " Modified ";
		}
		return modifiedArray;
	}

	public static void main(String[] args) {

		String arrayString[] = { "String 1", "String 2", "String 3", "String 4" };

		String arrayString3[] = { "String 1", "String 2", "String 3", "String 4" };
		String arrayString2[];

		arrayString2 = arrayString.clone();

		System.out.println("Display arrayString");
		ArrayOperations.displayArray(arrayString);

		System.out.println("Display arrayString2");
		ArrayOperations.displayArray(arrayString2);

		// equals NO FUNCIONA PROBARLO
		// CAMBIARLO POR EL METODO QUE HEMOS CREADO

		if (arrayString.equals(arrayString2)) {

			System.out.println("arrayString y arrayString2 are equal with equal method");

		} else {

			System.out.println("arrayString y arrayString2 are equal with equal method");
		}

		if (ArrayOperations.arrayEquality(arrayString, arrayString2)) {

			System.out.println("arrayString y arrayString2 are equal with our method");

		} else {

			System.out.println("arrayString y arrayString2 are not equal with equal method");
		}

		arrayString2 = ArrayOperations.modifyArray(arrayString);
		System.out.println("arrayString2 is displayed after being modified with the modifyArray method");
		ArrayOperations.displayArray(arrayString2);

		if (ArrayOperations.arrayEquality(arrayString, arrayString2)) {

			System.out.println("arrayString y arrayString2 are equal");

		} else {

			System.out.println("arrayString y arrayString2 are not equal");
		}
	}

}
