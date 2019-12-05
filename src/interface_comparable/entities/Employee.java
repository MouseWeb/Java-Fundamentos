package interface_comparable.entities;

//	Método compareTo:
//		Parâmetros: o - o objeto a ser comparado.
//		Retorna: um inteiro negativo, zero ou um inteiro positivo, pois esse objeto é menor, igual ou maior que o objeto especificado.

public class Employee implements Comparable<Employee>{
	
	private String name;
	private Double salary;
	
	public Employee(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	// Esse método serve para compara um objeto com outro 
	@Override
	public int compareTo(Employee other) {
		return name.compareTo(other.getName());
	}
	
	
}
