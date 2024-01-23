package arraysofobjects.agregation;

public class Shop {

	private static final int CLIENT_MAX = 200;
	private String name;
	private String address;

	private Client[] clients;

	public Shop(String name, String address) {

		this.name = name;
		this.address = address;

		clients = new Client[CLIENT_MAX];
	}

	public boolean addClient(Client cl) {

		int count = 0;
		boolean freeSpace = false;

		while (count < this.clients.length && !freeSpace) {

			if (clients[count] != null) {

				freeSpace = true;

			} else {
			count++;
			}
		}

		if (freeSpace) {

			clients[count] = cl;

		}

		return freeSpace;
	}

	public boolean deleteClient(Client cl) {

		boolean found = false;
		for (int i = 0; i < CLIENT_MAX && !found; i++) {

			if (clients[i].equals(cl)) {
				found = true;
				clients[i] = null;
			}

		}
		
		return found;

	}

}
