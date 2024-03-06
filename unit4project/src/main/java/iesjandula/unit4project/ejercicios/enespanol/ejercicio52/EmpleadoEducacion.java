package iesjandula.unit4project.ejercicios.enespanol.ejercicio52;

public abstract class EmpleadoEducacion {
	
	private String nombre="";
	private String apellidos="";
	private String telefono="";
	private String direccion="";
	private double sueldoBruto=0.0;
	private double irpf=0.0;

	
	
	public abstract String funciones() ;	
	public abstract double calcularSueldo() ;

	
	public EmpleadoEducacion() {
		
		
	}
	
	public EmpleadoEducacion(String nombre, String apellidos, String telefono, String direccion, double sueldoBruto,
			double irpf) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.direccion = direccion;
		this.sueldoBruto = sueldoBruto;
		this.irpf = irpf;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

	public double getIrpf() {
		return irpf;
	}

	public void setIrpf(double irpf) {
		this.irpf = irpf;
	}
	@Override
	public String toString() {
		return "EmpleadoEducacion [nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", direccion=" + direccion + ", sueldoBruto=" + sueldoBruto + ", irpf=" + irpf + "]";
	}
	


	
	
	

}
