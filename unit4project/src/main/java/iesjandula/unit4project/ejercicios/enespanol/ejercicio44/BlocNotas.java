package iesjandula.unit4project.ejercicios.enespanol.ejercicio44;



public class BlocNotas {
	
	private final int MAX_NOTAS=200;
	private Nota[] notas;
	private int contNotas;
	
	
	public BlocNotas() {
		
		notas = new Nota[MAX_NOTAS];
	}
			
			
	
	public BlocNotas(Nota[] notas) {
		this();
		addNotas(notas);
	}

	
	
	
	public Nota[] getNotas() {

		Nota [] notasRes = new Nota[contNotas];
		
		int contNot = 0;

		for (int i = 0; i < notas.length && contNot < contNotas; i++) {

			if (notas[i]!= null) {

				notasRes[contNot] = notas[i];
				contNot++;
			}

		}
		
		
		return notasRes;
	}
		
		
	
	public void addNota(Nota nota) {

		int cont = 0;
		boolean hayHueco = false;

		while (cont < this.notas.length && !hayHueco) {

			if (notas[cont] == null) {

				hayHueco = true;

			} else {
				cont++;
			}

		}
		
		notas[cont]=nota;
		contNotas++;
		
	}
	
	public boolean eliminarNota(Nota nota) {
		// TODO Auto-generated method stub

		boolean encontrado = false;
		for (int i = 0; i < MAX_NOTAS && !encontrado; i++) {

			if (notas[i]!= null && notas[i].equals(nota)) {
				encontrado = true;
				notas[i] = null;
				contNotas--;
			}

		}

		return encontrado;

	}

	
	
	public void addNotas(Nota[] notasAdd) {
		for (int i = 0; i < notasAdd.length && contNotas < MAX_NOTAS; i++) {

			addNota(notasAdd[i]);

		}

	}
	
	public boolean hayNotas() {

		return contNotas > 0;
	}

	public Nota buscarNotaPorId(int id) {

		Nota notaRes = null;
		boolean encontrado = false;

		for (int i = 0; i < MAX_NOTAS; i++) {

			if (notas[i]!=null && notas[i].getId()==id && !encontrado) {

				notaRes = notas[i];
			}

		}
		return notaRes;

	}

	
	public void listarNotas() {
		
	
			for (Nota nota: this.getNotas()) {
				
				System.out.println(nota);
			}
	}

}
