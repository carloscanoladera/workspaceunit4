package arraysofobjects.employees;

import java.util.Scanner;

public class ArrayEmployees {
	
	public static void main(String[] args) {
		
		int numEmpl=0;
		String name="";
		String lastName="";
		Scanner sc  = new Scanner(System.in);
		
		Employee employees[];
		
		
		System.out.println("How many employees would be stored in the array?");
		numEmpl= sc.nextInt();
		employees= new Employee[numEmpl];
		
		for (int id=0; id<numEmpl; id++) {
			
			System.out.println("Write the name of the employee");
			name= sc.next();
			
			System.out.println("Write the middle of the employee");
	
			lastName= sc.next();
					
			System.out.println("Write the lastname of the employee");
			
			lastName= lastName+ " " + sc.next();
					
			
			Employee emp = new Employee(id, name, lastName);
			
			employees[id] = emp;
			
		}
	
		
		for (Employee empl : employees) {
			
			System.out.println(empl);
		}
		
	}

}
