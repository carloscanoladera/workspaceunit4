package arraysdeobjetos.agregacion;

public class Tienda {

	private static final int CLIENTE_MAX = 200;
	private String nombre;
	private String direccion;

	private Cliente[] clientes;

	public Tienda(String nombre, String direccion) {

		this.nombre = nombre;
		this.direccion = direccion;

		clientes = new Cliente[CLIENTE_MAX];
	}

	public boolean addCliente(Cliente cl) {

		int cont = 0;
		boolean hayHueco = false;

		while (cont < this.clientes.length && !hayHueco) {

			if (clientes[cont] != null) {

				hayHueco = true;

			} else {
			cont++;
			}
		}

		if (hayHueco) {

			clientes[cont] = cl;

		}

		return hayHueco;
	}

	public boolean borrarCliente(Cliente cl) {

		boolean encontrado = false;
		for (int i = 0; i < CLIENTE_MAX && !encontrado; i++) {

			if (clientes[i].equals(cl)) {
				encontrado = true;
				clientes[i] = null;
			}

		}
		
		return encontrado;

	}

}
