package iesjandula.unit4project.ejercicios.enespanol.ejercicio52;

public class Administrativo extends EmpleadoEducacion {

	private EnumCategoria categoria;
	private EnumPerfil perfil;

	public Administrativo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrativo(String nombre, String apellidos, String telefono, String direccion, double sueldoBruto,
			double irpf, EnumCategoria categoria, EnumPerfil perfil) {
		super(nombre, apellidos, telefono, direccion, sueldoBruto, irpf);
		// TODO Auto-generated constructor stub

		this.categoria = categoria;
		this.perfil = perfil;
	}

	@Override
	public String funciones() {

		return "Realizar labores administrativas";
	}

	@Override
	public double calcularSueldo() {
		// TODO Auto-generated method stub
		return getSueldoBruto() + categoria.getBonus() - impuestos();
	}

	private double impuestos() {

		return (getSueldoBruto() + categoria.getBonus()) * this.getIrpf();
	}

	@Override
	public String toString() {
		return "Administrativo [categoria=" + categoria + ", perfil=" + perfil + ", nombre=" + getNombre()
				+ ", apellidos=" + getApellidos() + ", telefono=" + getTelefono() + ", direccion=" + getDireccion()
				+ ", sueldoBruto" + getSueldoBruto() + ", irpf)=" + getIrpf() + "]";
	}

}