package iesjandula.unit4project.ejercicios.enespanol.ejercicio49;

public class Departamento {
	
	
	private String nombre;
	
	private Municipio[] municipios;
	
	
	public Departamento(String nombre) {
	
		this.nombre = nombre;
		
	}

	// hacerlo con objeto MunicipioNulo
	//Añadir los mismos métodos que en tienda además de los que te pide el ejercicio
	public Departamento(String nombre, Municipio[] municipios) {
		this(nombre);
		
	}
	
	
	

}
