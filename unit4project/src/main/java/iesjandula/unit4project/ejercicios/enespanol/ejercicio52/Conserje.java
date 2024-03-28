package iesjandula.unit4project.ejercicios.enespanol.ejercicio52;

public class Conserje extends EmpleadoEducacion {

	public Conserje(String dni, String nombre, String apellidos, String telefono, String direccion, double sueldoBruto, double irpf) {

		super(dni, nombre, apellidos, telefono, direccion, sueldoBruto, irpf);

	}

	@Override
	public String funciones() {

		return "Realizar labores de conserje";
	}

	@Override
	public double calcularSueldo() {

		return this.getSueldoBruto() - impuestos();
	}

	protected double impuestos() {

		return this.getSueldoBruto() * this.getIrpf();
	}

	@Override
	public String toString() {
		return "Conserje [dni=" + getDni() + " nombre: " + getNombre() + ", apellidos=" + getApellidos() + ", telefono="
				+ getTelefono() + ", direccion=" + getDireccion() + ", sueldoBruto" + getSueldoBruto() + ", irpf)="
				+ getIrpf() + "]";
	}

}
