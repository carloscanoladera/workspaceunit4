package arraysofobjects.agregation;

public class AppShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Shop tienda= new Shop("Fragos","Calle la cava 18");
		
		tienda.addClient(new Client("Julian","Muñoz", "443982"));
		tienda.addClient(new Client("Luis","Bied", "33367343"));
		tienda.addClient(new Client("Julian","Muñoz", "213443"));
		
				

	}

}
