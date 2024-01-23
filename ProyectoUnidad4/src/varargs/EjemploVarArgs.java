package varargs;

public class EjemploVarArgs {

	// metodo que toma un numero variable de parametros
	static void fun(int... a) {
		System.out.println("Numero de parametros " + a.length);

		// for each
		for (int i : a)
			System.out.print(i + " ");
		System.out.println();

		// recorrido con for y notacion de array
		for (int i = 0; i < a.length; i++) {

			a[i]++;

		}
	}

	// Metodo que toma un array como parametro.
	static void fun3(int[] a) {

	}

	// metodo main
	public static void main(String args[]) {

		int[] arrayNum = { 1, 3, 4, 6, 7 };
		// llamamos con un numero diferente de parametros a fun

		// 1 parametro
		fun(100);

		// 4 parametros
		fun(1, 2, 3, 4);

		// esta llamada fallaria en compilacion
		// fun3(1, 2, 3, 4);
		// sin parametros
		fun();

		fun3(arrayNum);

		fun(arrayNum);
		fun(arrayNum);
	}
}