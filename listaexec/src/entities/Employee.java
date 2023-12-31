package entities;

public class Employee {

	public Employee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	

	private Integer id;
	private String name;
	private Double salary;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public void increaseSalary(double percentage) {
		salary += salary * (percentage / 100);
	}

	@Override
	public String toString() {
		return "Employee [id = " + id + ", name = " + name + ", salary = " + String.format("%.2f", salary) + "]";
	}

}
