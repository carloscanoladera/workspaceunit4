package arrays;

import java.util.Scanner;

public class ArrayTemperaturesForEach {
	
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("How many days you want to register temperatures for? ");
		int numberOfDays = console.nextInt();
		int next = 0;
		float dayArray[] = new float[numberOfDays];
		int sum = 0;
		for (int i = 0; i < numberOfDays; i++) {
			System.out.print("Day " + ( i + 1) + ", Input the maximun temperature ");
			next = console.nextInt();
			dayArray[i] = next;
			sum += next;
		}

		double media = (double) sum / numberOfDays;
		System.out.println();
		System.out.println("Temperature average = " + media);
		
		float maxTemp=0;
		int dayCount=0;
		for (float temperature: dayArray) {
			
			
			if (maxTemp < temperature ) 
				maxTemp= temperature;
			
			if (temperature<20) 
				dayCount++;
		}
		
		System.out.println("The maximun temp for all days is: " + maxTemp);
		

	}

}
