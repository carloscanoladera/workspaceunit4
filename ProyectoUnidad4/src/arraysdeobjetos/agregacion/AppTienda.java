package arraysdeobjetos.agregacion;

public class AppTienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Tienda tienda= new Tienda("Fragos","Calle la cava 18");
		
		tienda.addCliente(new Cliente("Julian","Muñoz", "443982"));
		tienda.addCliente(new Cliente("Luis","Bied", "33367343"));
		tienda.addCliente(new Cliente("Julian","Muñoz", "213443"));
		
				

	}

}
