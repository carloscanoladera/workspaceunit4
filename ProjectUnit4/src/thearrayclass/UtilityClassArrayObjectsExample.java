package thearrayclass;

import java.util.Arrays;
import java.util.Comparator;

public class UtilityClassArrayObjectsExample {

	public static Employee[] devuelveArrayEmpl() {
		Employee[] array = new Employee[8];

		array[0] = new Employee(0, "Pepe", "Lopez");
		array[1] = new Employee(1, "Raul", "Fernandez");
		array[2] = new Employee(2, "Luis", "Suñer");
		array[3] = new Employee(3, "Ivan", "Garcia");
		array[4] = new Employee(4, "Rodolfo", "Langostino");
		array[5] = new Employee(5, "Jeru", "Abad");
		array[6] = new Employee(6, "Joshua", "Edelman");
		array[7] = new Employee(7, "Rob", "Camavinga");

		return array;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee[] arrayEmpl = devuelveArrayEmpl();

		System.out.println("Unsorted Array : " + Arrays.toString(arrayEmpl));

		// Sort by Employee Comparator
		Arrays.sort(arrayEmpl);
		System.out.println("Array sorted by the Employee comparable criteria:\n " + Arrays.toString(arrayEmpl));

		// Sort by the comparator passed as a parameter

		Arrays.sort(arrayEmpl, new ComparatorEmployeeName());

		System.out.println("Array sorted by the ComparatorEmployeeName criteria:\n " + Arrays.toString(arrayEmpl));

		// Sort by the comparator passed as a lambda parameter

		Arrays.sort(arrayEmpl, (e1, e2) -> e1.getId() > e2.getId() ? 1 : e1.getId() == e2.getId() ? 0 : -1);

		System.out.println("Array sorted by the lambda expression :\n " + Arrays.toString(arrayEmpl));

		// parallel sort using all processor cores

		Arrays.parallelSort(arrayEmpl);

		System.out.println(
				"Array has been sorted parallelly by the Employee comparable criteria: " + Arrays.toString(arrayEmpl));

	}

}
