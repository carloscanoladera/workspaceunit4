package arraysdeobjetos.empleados;

import java.util.Scanner;

public class ArrayEmpleados {
	
	public static void main(String[] args) {
		
		int numEmpl=0;
		String nombre="";
		String apellidos="";
		Scanner sc  = new Scanner(System.in);
		
		Empleado empleados[];
		
		
		System.out.println("Cuantos empleados desea para el array");
		numEmpl= sc.nextInt();
		empleados= new Empleado[numEmpl];
		
		for (int id=0; id<numEmpl; id++) {
			
			System.out.println("Escriba el nombre del empleado");
			nombre= sc.next();
			
			System.out.println("Escriba el primer apellidos del empleado");
	
			apellidos= sc.next();
					
			System.out.println("Escriba el segundo apellido del empleado");
			
			apellidos= apellidos+ " " + sc.next();
					
			
			Empleado emp = new Empleado(id, nombre, apellidos);
			
			empleados[id] = emp;
			
		}
	
		
		for (Empleado empl : empleados) {
			
			System.out.println(empl);
		}
		
	}

}
