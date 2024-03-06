package iesjandula.unit4project.ejercicios.enespanol.ejercicio52;

import iesjandula.unit4project.ejercicios.enespanol.ejercicio44.Nota;

public class Escuela {
	private final int MAX_EMPLEADOS = 200;
	private String nombre;
	private String direccion;
	private int codigo;
	private EmpleadoEducacion[] empleados;
	private int contEmpleados;

	public Escuela(String nombre, String direccion, int codigo) {
	
		this.nombre = nombre;
		this.direccion = direccion;
		this.codigo = codigo;
		empleados = new EmpleadoEducacion[MAX_EMPLEADOS];
		contEmpleados = 0;

	}

	public Escuela(String nombre, String direccion, int codigo, EmpleadoEducacion[] empleadoEducacion) {
		this(nombre, direccion, codigo);

		addEmpleados(empleadoEducacion);

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void agregarEmpleado(EmpleadoEducacion empl) {

		int cont = 0;
		boolean hayHueco = false;

		while (cont < this.empleados.length && !hayHueco) {

			if (empleados[cont] == null) {

				hayHueco = true;

			} else {
				cont++;
			}

		}

		empleados[cont] = empl;
		contEmpleados++;

	}

	public EmpleadoEducacion buscarEmpleadoEducacion(String nombreApellidos) {
		// TODO Auto-generated method stub

		boolean encontrado = false;
		String nombreApell = "";

		EmpleadoEducacion emple = null;

		for (int i = 0; i < MAX_EMPLEADOS && !encontrado; i++) {

			if (empleados[i] != null) {

				nombreApell = empleados[i].getNombre() + " " + empleados[i].getApellidos();

				if (nombreApell.equals(nombreApellidos)) {

					encontrado = true;
					emple = empleados[i];
				}

			}
		}

		return emple;

	}

	public boolean eliminarEmpleadoEducacion(String nombreApellidos) {
		// TODO Auto-generated method stub

		boolean encontrado = false;
		String nombreApell = "";
		for (int i = 0; i < MAX_EMPLEADOS && !encontrado; i++) {

			if (empleados[i] != null) {

				nombreApell = empleados[i].getNombre() + " " + empleados[i].getApellidos();

				if (nombreApell.equals(nombreApellidos)) {
					encontrado = true;

					empleados[i] = null;
					contEmpleados--;
				}

			}
		}

		return encontrado;

	}

	public EmpleadoEducacion[] obtenEmpleados() {

		EmpleadoEducacion[] emplRes = new EmpleadoEducacion[contEmpleados];

		int contEmp = 0;

		for (int i = 0; i < empleados.length && contEmp < contEmpleados; i++) {

			if (empleados[i] != null) {

				emplRes[contEmp] = empleados[i];
				contEmp++;
			}

		}

		return emplRes;
	}

	public void addEmpleados(EmpleadoEducacion[] empleadosEdu) {

		boolean res = true;
		for (int i = 0; i < empleadosEdu.length && contEmpleados < MAX_EMPLEADOS; i++) {

			
			if (empleadosEdu[i]!=null)
				agregarEmpleado(empleadosEdu[i]);

		}

	}

	public Conserje[] obtenConserjes() {
		int cont = 0;
		Conserje[] arrayCon = new Conserje[contarConserjes()];

		for (int i = 0; i < MAX_EMPLEADOS; i++) {

			if (empleados[i] instanceof Conserje) {
				arrayCon[cont] = (Conserje) empleados[i];
				cont++;
			}
		}

		return arrayCon;

	}

	private int contarConserjes() {
		int cont = 0;

		for (int i = 0; i < MAX_EMPLEADOS; i++) {

			if (empleados[i] instanceof Conserje)
				cont++;

		}

		return cont;
	}

	public Profesor[] obtenProfesores() {
		int cont = 0;
		Profesor[] arrayProf = new Profesor[contarProfesores()];

		for (int i = 0; i < MAX_EMPLEADOS; i++) {

			if (empleados[i] instanceof Profesor) {
				arrayProf[cont] = (Profesor) empleados[i];
				cont++;
			}
		}

		return arrayProf;

	}

	private int contarProfesores() {
		int cont = 0;

		for (int i = 0; i < MAX_EMPLEADOS; i++) {

			if (empleados[i] instanceof Profesor)
				cont++;

		}

		return cont;
	}

	public Administrativo[] obtenAdministrativos() {
		int cont = 0;
		Administrativo[] arrayAdm = new Administrativo[contarAdmin()];

		for (int i = 0; i < MAX_EMPLEADOS; i++) {

			if (empleados[i] instanceof Administrativo) {
				arrayAdm[cont] = (Administrativo) empleados[i];
				cont++;
			}
		}

		return arrayAdm;

	}

	private int contarAdmin() {
		int cont = 0;

		for (int i = 0; i < MAX_EMPLEADOS; i++) {

			if (empleados[i] instanceof Administrativo)
				cont++;

		}

		return cont;
	}

	public boolean hayEmpleados() {

		return contEmpleados > 0;
	}

}
