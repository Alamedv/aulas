package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	List <Employee> list = new ArrayList<>();
	
	System.out.println("How many employees will be registered?");
	int n = sc.nextInt();
	
	for (int i=1; i<=n; i++) {
		System.out.println("Emplyoee #" + i + ":");	
		System.out.println("Id: ");
		int id = sc.nextInt();
		System.out.println("Name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Salary: ");
		double salary = sc.nextDouble();
		
		//maneira nao resumida:
		//Employee emp = new Employee(id, name, salary);
		//list.add(emp);
		
		list.add(new Employee(id, name, salary));
	}
	System.out.println("Enter the employee id that will have salary increase:");
	int id = sc.nextInt();
	Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
	if (emp == null) {
		System.out.println("This ID does not exist!");
	}
	else {
		System.out.println("Enter the percentage: ");
		double perc = sc.nextDouble();
		emp.increaseSalary(perc);
	}
	for (Employee obj : list) {
		System.out.println(obj);
	}
		sc.close();
	}

}
