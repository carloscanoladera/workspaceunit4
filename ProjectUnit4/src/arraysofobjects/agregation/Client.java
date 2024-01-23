package arraysofobjects.agregation;

import java.util.Objects;

public class Client {
	
	private String name;
	private String lastname;
	private String id;
	
	public Client() {
		
		
	}
	public Client(String name, String lastname, String id) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastname;
	}
	public void setLastName(String lastname) {
		this.lastname = lastname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	


	public boolean equals(Client cl) {
		if (this == cl)
			return true;
		if (cl == null)
			return false;

		
		return Objects.equals(lastname, cl.lastname) && Objects.equals(id, cl.id)
				&& Objects.equals(name, cl.name);
	}
	
	
	
	
	
	
	

}
