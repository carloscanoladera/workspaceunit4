package iesjandula.unit4project.arraysdeobjetos.agregacion;

import java.util.Objects;

public class Cliente implements Comparable<Cliente>{
	
	private String nombre;
	private String apellidos;
	private String dni;
	
	public Cliente() {
		
		
	}
	public Cliente(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	public boolean equals(Cliente cl) {
		if (this == cl)
			return true;
		if (cl == null)
			return false;

		
		return Objects.equals(dni, cl.dni);
				
	}
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}
	@Override
	public int compareTo(Cliente o) {

		return this.dni.compareTo(o.getDni());
	}


	
	

}
