package entities;

public class Employee {

	
	
	@Override
	public String toString() {
		return "Employee [name = " + name + ", id = " + id + ", salary = " + String.format("%.2f", salary) + "]";
	}

	private String name;
	private Integer id;
	private Double salary;

	public Employee(String name, Integer id, Double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getSalary() {
		return salary;
	}

	public void increaseSalary (double percentage) {
		salary += salary * percentage /100;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}

}
