package iesjandula.unit4project.ejercicios.enespanol.ejercicio51;

import java.util.Objects;

public abstract class Empleado implements Comparable<Empleado> {

	private String nombre;
	private String apellidos;
	private String nif;
	private int antigüedad;
	private double salario;

	public abstract EnumCategoria tipoEmpleado();

	public abstract double calculaSueldo(double impuestos);

	public Empleado(String nombre, String apellidos, String nif, int antigüedad, double salario) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.antigüedad = antigüedad;
		this.salario = salario;
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

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public int getAntigüedad() {
		return antigüedad;
	}

	public void setAntigüedad(int antigüedad) {
		this.antigüedad = antigüedad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
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
		Empleado other = (Empleado) obj;
		return Objects.equals(nif, other.nif);
	}

	@Override
	public String toString() {
		return "Empleado [ tipo=" + this.tipoEmpleado() + ", nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif
				+ ", antigüedad=" + antigüedad + ", salario=" + salario + "]";
	}

	@Override
	public int compareTo(Empleado o) {
		// TODO Auto-generated method stub
		return this.getNif().compareTo(o.getNif());
	}
	
	protected final double calculaImpuestos(double sueldoBruto, double impuestos) {

		return sueldoBruto * impuestos;
	}

}
