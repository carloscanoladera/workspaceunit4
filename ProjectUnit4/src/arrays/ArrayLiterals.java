package arrays;


public class ArrayLiterals {

	public static void writeArrayInt(int[] array) {

		for (int i = 0; i < array.length; i++) {

			if (i == array.length - 1)
				System.out.format("|%-4d|", array[i]);
			else
				System.out.format("|%-4d", array[i]);

		}

		System.out.println();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrayDays = { 1, 2, 3, 4, 5, 6, 7 };
		char[] vowels = { 'a', 'b', 'c', 'd', 'e' };
		byte[] ipHost = { 2, 4, 127, 20, 12 };
		float[] temperatures = { 20, 15.3f, 10, 30.2f, 12, 14, 12.5f };

		String[] arrayDays2 = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

		writeArrayInt(arrayDays);

		System.out.println("Length of arrayDays:" + arrayDays2.length);

		System.out.println(arrayDays2[2]);

	}

}
