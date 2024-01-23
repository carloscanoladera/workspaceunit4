package thearrayclass;

import java.util.Comparator;
import java.util.Objects;

public class Employee implements Comparable<Employee> {

	int id;
	String name;

	String lastname;

	public Employee() {

	}

	public Employee(int id, String name, String lastname) {

		this.id = id;
		this.name = name;
		this.lastname = lastname;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", lastname=" + lastname + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(lastname, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(lastname, other.lastname) && id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		String nameCompEmp1 = this.getLastName() + " " + this.getName();
		String nameCompEmp2 = o.getLastName() + " " + o.getName();

		return nameCompEmp1.compareTo(nameCompEmp2);

	}

}