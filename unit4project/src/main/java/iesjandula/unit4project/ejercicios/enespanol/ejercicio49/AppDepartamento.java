package iesjandula.unit4project.ejercicios.enespanol.ejercicio49;

public class AppDepartamento {

	public static void main(String[] args) {
	

		
		
		Municipio m1= new Municipio("Andujar", 35000, 14.2, 250.2);
		Municipio m2= new Municipio("Ubeda", 45000, 10.2, 455.2);
		
		Departamento dep = new Departamento("Sierra Morena");
		
		
		dep.agregarMunicipio(m1);
		dep.agregarMunicipio(m2);
		
		dep.eliminarMunicipio(m2);
		
		dep.imprimirInfoDepartamento();
		
		dep.agregarMunicipio(m2);
		

		dep.imprimirInfoDepartamento();
	

	}

}
