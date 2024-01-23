package arrays;

import java.util.*;

public class ArrayRecorridoSecuencial {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("For how many days do you? ");
		int numDias = console.nextInt();
		int next = 0;
		float arrayDias[] = new float[numDias];
		int sum = 0;
		for (int i = 1; i <= numDias; i++) {
			System.out.print("Dia " + i + ", Introduce la Temperatura mas alta ");
			next = console.nextInt();
			arrayDias[i] = next;
			sum += next;
		}

		double media = (double) sum / numDias;
		System.out.println();
		System.out.println("Media de temperatura = " + media);

	}
}
