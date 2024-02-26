package iesjandula.unit4project.matrices;

public class RecorridoMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_ROW = 3;
		final int MAX_COLUMN = 4;
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		System.out.println("Recorrido por filas");

		// arr[0][0], arr[0][1], ... arr[0][MAX_COLUMN],
		// arr[1][0], arr[1][1], ... arr[1][MAX_COLUMN],
		// .
		// .
		// arr[MAX_ROW][0], arr[MAX_ROW][1], ... arr[MAX_ROW][MAX_COLUMN]

		for (int i = 0; i < MAX_ROW; i++) {

			for (int j = 0; j < MAX_COLUMN; j++) {

				System.out.format("%1$4d |", arr[i][j]);

			}

			System.out.println();

		}

		System.out.println("Recorrido por columnas");
		// arr[0][0], arr[1][0], ... arr[MAX_ROW][0],
		// arr[0][1], arr[1][1], ... arr[MAX_ROW][1],
		// .
		// .
		// arr[0][MAX_COLUMN], arr[0][MAX_COLUMN], ... arr[0][MAX_COLUMN]

		for (int i = 0; i < MAX_COLUMN; i++) {

			for (int j = 0; j < MAX_ROW; j++) {

				System.out.format("%1$4d |", arr[j][i]);

			}

			System.out.println();

		}

		

	}

}
