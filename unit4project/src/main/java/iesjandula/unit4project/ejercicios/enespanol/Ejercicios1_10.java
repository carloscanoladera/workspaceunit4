package iesjandula.unit4project.ejercicios.enespanol;

import java.util.Scanner;

import iesjandula.unit4project.arrays.ArrayLiterales;

public class Ejercicios1_10 {

	public static int[] leer10yGuardarEnArray() {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {

			System.out.println("Introduce un número: ");

			arr[i] = sc.nextInt();

		}

		ArrayLiterales.pintarArrayEnteros(arr);

		return arr;
	}

	public static int[] leerNyGuardarEnArray(int n) {
		int[] arr = new int[n];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {

			System.out.println("Introduce un número: ");

			arr[i] = sc.nextInt();

		}

		ArrayLiterales.pintarArrayEnteros(arr);

		return arr;

	}

	public static int[] leerNyGuardarParesEnArray(int n) {
		int[] arr = new int[n];
		int posicion = 0;
		int num = 0;

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {

			System.out.println("Introduce un número: ");
			num = sc.nextInt();
			if (num % 2 == 0) {
				arr[posicion] = num;
				posicion++;

			}

		}

		ArrayLiterales.pintarArrayEnteros(arr, 0);

		return arr;

	}

	public static String[] leerNStringyGuardarEnArray(int n) {
		String[] arr = new String[n];
		int posicion = 0;
		int num = 0;

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {

			System.out.println("Introduce un número: ");

			arr[i] = sc.nextLine();

		}

		ArrayLiterales.pintarArrayCadenas(arr);

		return arr;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		leerNStringyGuardarEnArray(4);
		leerNyGuardarParesEnArray(4);

	}

}
