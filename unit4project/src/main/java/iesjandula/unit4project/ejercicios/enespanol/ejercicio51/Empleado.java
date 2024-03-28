package iesjandula.unit4project.ejercicios.enespanol.ejercicio51;

import java.util.Objects;

public abstract class Empleado extends Persona {

	private int antigüedad;
	private double salario;

	public abstract EnumCategoria tipoEmpleado();

	public abstract double calculaSueldo(double impuestos);

	public Empleado(String nombre, String apellidos, String nif, int antigüedad, double salario) {
		super(nombre, apellidos, nif);

		this.antigüedad = antigüedad;
		this.salario = salario;
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
	public String toString() {
		return "Empleado [antigüedad=" + antigüedad + ", salario=" + salario + ", nif=" + getNif() + ", nombre="
				+ getNombre() + ", apeliidos=" + getApellidos() + "]";
	}

	protected final double calculaImpuestos(double sueldoBruto, double impuestos) {

		return sueldoBruto * impuestos;
	}

}
