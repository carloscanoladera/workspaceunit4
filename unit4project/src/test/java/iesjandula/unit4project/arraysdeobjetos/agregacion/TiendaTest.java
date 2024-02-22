package iesjandula.unit4project.arraysdeobjetos.agregacion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TiendaTest {

	private Cliente mockClient;
	private Tienda mockTienda;

	@BeforeEach
	void setup() {

		mockClient = new Cliente("Jesus", "Soto", "444444");

		mockTienda = new Tienda("Software J&P", "C. San Vicente Paul, 32, 23740 Andújar, Jaén");

	}

	@Test
	void addClienteTest() {

		mockTienda.addCliente(mockClient);

		Cliente[] array = mockTienda.getClientes();
		Arrays.sort(array);
		// Arrays.parallelSort(array,(cl1,cl2)->
		// cl1.getNombre().compareTo(cl2.getNombre()));
		assertTrue(Arrays.binarySearch(array, mockClient) >= 0);

		// assertTrue(buscarElemArray(array, mockClient));

	}

	@Test
	void borrarClienteTest() {

		mockTienda.addCliente(mockClient);

		mockTienda.borrarCliente(mockClient);

		for (Cliente cliente : mockTienda.getClientes()) {

			assertNotEquals(cliente, mockClient);

		}

	}

	@Test
	void hayClientesTest() {

		assertFalse(mockTienda.hayClientes());
		mockTienda.addCliente(mockClient);
		assertTrue(mockTienda.hayClientes());

	}

	@Test
	void hayClientesIntegracionTest() {

		assertFalse(mockTienda.hayClientes());
		mockTienda.addCliente(mockClient);
		assertTrue(mockTienda.hayClientes());
		mockTienda.borrarCliente(mockClient);
		assertFalse(mockTienda.hayClientes());

	}

	/*
	 * private boolean buscarElemArray(Cliente[] clientes, Cliente cliente) {
	 * 
	 * boolean encontrado = false;
	 * 
	 * for (int i = 0; i < clientes.length && !encontrado; i++) {
	 * 
	 * if (cliente.equals(clientes[i])) {
	 * 
	 * encontrado = true; }
	 * 
	 * }
	 * 
	 * return encontrado; }
	 */
}
