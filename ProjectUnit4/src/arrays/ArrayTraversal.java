package arrays;

import java.util.*;

public class ArrayTraversal {

	
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("For how many days you would like to measure temperatures? ");
		int numberOfDays = console.nextInt();
		int next = 0;
		float dayArray[] = new float[numberOfDays];
		int sum = 0;
		for (int i = 1; i <= numberOfDays; i++) {
			System.out.print("Day " + i + ", Introduce the max temp ");
			next = console.nextInt();
			dayArray[i-1] = next;
			sum += next;
		}

		double average = (double) sum / numberOfDays;
		System.out.println();
		System.out.println("Average temperature = " + average);

	}


}
