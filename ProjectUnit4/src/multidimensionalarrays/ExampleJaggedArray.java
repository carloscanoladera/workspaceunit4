package multidimensionalarrays;

import java.util.Random;

public class ExampleJaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] irregularBraces = { { 1, 2, 3 }, { 1 }, { 3, 4 }, { 5, 6, 7, 8 } };

		printArray(irregularBraces);

		int[][] irregularNew = new int[3][];

		irregularNew[0] = new int[4];
		irregularNew[0][0] = 5;
		irregularNew[0][1] = 2;
		irregularNew[0][2] = 4;
		irregularNew[0][3] = 7;

		irregularNew[1] = new int[2];

		irregularNew[1][0] = 7;
		irregularNew[1][1] = 8;

		irregularNew[2] = new int[3];

		irregularNew[2][0] = 10;
		irregularNew[2][1] = 15;
		irregularNew[2][2] = 15;

		printArray(irregularNew);

		int[][] irregularRandom;

		Random rand = new Random();
		int rows = rand.nextInt(3, 8);

		irregularRandom = new int[rows][];

		int columns = 0;
		for (int i = 0; i < rows; i++) {

			columns = rand.nextInt(2, 10);

			irregularRandom[i] = new int[columns];

			for (int j = 0; j < columns; j++) {

				irregularRandom[i][j] = rand.nextInt(-1000, 1000);

			}

		}
		
		printArray(irregularRandom);	

	}

	public static void printArray(int[][] irregularArray) {

		String res = "";

		for (int i = 0; i < irregularArray.length; i++) {

			for (int j = 0; j < irregularArray[i].length; j++) {

				res += String.format("|%4d|", irregularArray[i][j]);

			}

			res += "\n";
		}

		System.out.println(res);

	}

}
