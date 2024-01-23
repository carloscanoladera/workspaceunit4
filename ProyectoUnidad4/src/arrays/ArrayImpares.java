package arrays;

import java.util.Scanner;

public class ArrayImpares {
	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		System.out.print("Cuantos numeros impares a la lista? ");
		int numImpares = console.nextInt();
		int list[] = new int[numImpares];
		for (int i = 1; i <= numImpares; i++) {

			list[i] = 2 * i + 1;
			System.out.println("Numero impar posicion " + i + " y valor:" + list[i]);

		}

		System.out.println("inicial = " + list[0]);
		System.out.println("medio = " + list[list.length/2]);
		System.out.println("final = " + list[list.length-1]);

	}
}
