package arrays;

import java.util.Scanner;

public class Temperatures {

	public static void main(String[] args) {
		double[] temperature = new double[10];

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce 10 temperatures to fill the array");

		for (int i = 0; i < temperature.length; i++) {
			System.out.println("Input a temperature");
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
