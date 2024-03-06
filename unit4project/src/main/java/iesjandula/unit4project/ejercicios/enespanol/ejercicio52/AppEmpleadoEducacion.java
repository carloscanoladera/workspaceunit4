package iesjandula.unit4project.ejercicios.enespanol.ejercicio52;

public class AppEmpleadoEducacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conserje c1 = new Conserje("Luis", "Lamas", "8234732987", "Calle Zm 23" , 20000, 0.15 );
		Conserje c2 = new Conserje("Pepe", "Lopez", "47474747474", "Calle roda 3" , 20000, 0.15 );

		Profesor p1 = new Profesor("Julian", "Aragones",
				"5555534343", "Via de la Plata sn" , 40000, 0.20, "Informatica", Profesor.CUERPO_FORMACIONPROFESIONAL, 5 );
		

		Profesor p2 = new Profesor("David", "Ros",
				"5235263434343", "Calle RAmon 5" , 30000, 0.20, "Ingles", Profesor.CUERPO_SECUNDARIA, 5 );

		
		Administrativo a1 = new Administrativo("Eustaquio", "García",
				"36236363463", "Calle Atenas 7" , 30000, 0.20, EnumCategoria.CINCO, EnumPerfil.CONTABLE);
	
		
		Administrativo a2 = new Administrativo("Raul", "Lopez",
				"36236363463", "Ronda norte sn" , 30000, 0.20, EnumCategoria.TRES, EnumPerfil.LEGISLATIVO);
	
	
		
		EmpleadoEducacion[] emp = {c1,c2,p1,p2,a1,a2};
		
		Escuela escuela= new Escuela("IES Pedra", "Calle de arribas 20",848484844, emp);
		
		
		System.out.println("Empleados Educacion en escuela");
		
		for (EmpleadoEducacion empl: escuela.obtenEmpleados()) {
			
			
			System.out.println(empl);
			
		}
		
		escuela.eliminarEmpleadoEducacion("Luis Lamas");
		
		System.out.println("Conserjes en escuela");
		
		for (Conserje consj: escuela.obtenConserjes()) {
			
			
			System.out.println(consj);
			
		}
	
		System.out.println("Buscar Julian Aragones: " + escuela.buscarEmpleadoEducacion("Julian Aragones"));
	
	}

}
