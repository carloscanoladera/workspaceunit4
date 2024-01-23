package multidimensionalarrays;

import java.util.Arrays;

public class MultidimensionalArray {

	public static void print(double[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		
		
		double[][] temps = new double[3][5];
		temps[0][3] = 98.3; // fourth value of first row
		temps[2][0] = 99.4; // first value of third row

		System.out.println(temps);
		System.out.println(Arrays.deepToString(temps));
		
		
		MultidimensionalArray.print(temps);
		
		double [][] tempsFourWeeks = {{30,28,27,20,25,26,27},
				{20,21,24,25,26,23,24},
				{20,21,24,25,26,23,24},
				{20,21,24,25,26,23,24}};
		
		
		for (int i=0; i<tempsFourWeeks.length ; i++) {
			
			double average=0.0;
			
			for (int j=0; j<tempsFourWeeks[i].length;j++) {
				
				average= average+ tempsFourWeeks[i][j];
				
				
			}
			
			average= average/7;
			
			System.out.println("the average temp the week " + i + " is " + average);
			
		}		
		
		
	}

}
