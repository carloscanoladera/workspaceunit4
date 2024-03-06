package iesjandula.unit4project.ejercicios.enespanol.ejercicio51;
import java.util.Objects;

public class Cliente implements Comparable<Cliente> {
	
	private String nif;
	private String nombre;
	private String apellidos;
	private String telefono;
	
	
	public Cliente(String nif, String nombre, String apellidos, String telefono) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
	}


	public String getNif() {
		return nif;
	}


	public void setNif(String nif) {
		this.nif = nif;
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


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	

	@Override
	public String toString() {
		return "Cliente [nif=" + nif + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(apellidos, nif, nombre, telefono);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(nif, other.nif)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(telefono, other.telefono);
	}


	@Override
	public int compareTo(Cliente o) {
		// TODO Auto-generated method stub
		return this.getNif().compareTo(o.getNif());
	}
	
	

}
