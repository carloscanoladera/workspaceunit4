package matrizirregular;

public class TrianguloPascal {

	public static void rellena(int[][] triangulo) {
		for (int i = 0; i < triangulo.length; i++) {
			triangulo[i] = new int[i + 1];
			triangulo[i][0] = 1;
			triangulo[i][i] = 1;
			for (int j = 1; j < i; j++) {
				triangulo[i][j] = triangulo[i - 1][j - 1] + triangulo[i - 1][j];
			}
		}
	}

	public static void print(int[][] triangulo) {
		for (int i = 0; i < triangulo.length; i++) {
			for (int j = 0; j < triangulo[i].length; j++) {
				System.out.print(triangulo[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] triangulo = new int[11][];
		rellena(triangulo);
		print(triangulo);

	}

}

