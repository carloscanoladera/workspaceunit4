package arrays;

import java.util.Scanner;

public class OddNumbers {
	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		System.out.print("How many odd numbers you would like to add to the list ");
		int oddNumbers = console.nextInt();
		int list[] = new int[oddNumbers];
		for (int i = 1; i <= oddNumbers; i++) {

			list[i] = 2 * i + 1;
			System.out.println("Odd number index" + i + " and value:" + list[i]);

		}

		System.out.println("first = " + list[0]);
		System.out.println("middle = " + list[list.length / 2]);
		System.out.println("final = " + list[list.length - 1]);

	}

}
