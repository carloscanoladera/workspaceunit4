package arrays;

import java.util.Scanner;

public class Temperaturas {
	public static void main(String[] args) {
		double[] temperature = new double[10];

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce 10 temperaturas para rellenar el array");

		for (int i = 0; i < temperature.length; i++) {
			System.out.println("Escribe una temperatura");
			temperature[i] = sc.nextDouble();
		}

		for (int i = 0; i < temperature.length; i++) {

			if (i == temperature.length - 2)
				System.out.print(temperature[i] + " ,");
			else
				System.out.print(temperature[i] + " ,");
		}

	}

}
