package iesjandula.unit4project.ejercicios.enespanol.ejercicio51;

import java.util.Objects;

public abstract class Persona implements Comparable<Persona>{
	
	private String nif;
	private String nombre;
	private String apellidos;
	
	public Persona(String nif, String nombre, String apellidos) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.apellidos = apellidos;
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

	@Override
	public String toString() {
		return "Persona [nif=" + nif + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nif);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(nif, other.nif);
	}

	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		return this.getNif().compareTo(o.getNif());
	}
	
	
	

}
