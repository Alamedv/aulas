package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Tax payer #" + i + " data: \nIndividual or company (i/c)?");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();

			if (ch == 'c') {
				System.out.print("Number of employees: ");
				int numbOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numbOfEmployees));
			} else if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			}

		}
		System.out.println("\nTAXES PAID:");

		for (TaxPayer tp : list) {
			System.out.println(tp.getName() + ": $" + String.format("%.2f", tp.tax()));

		}
		double sum = 0;
		for (TaxPayer tp : list) {
			sum += tp.tax();
		}
		System.out.println("\nTOTAL TAXES: " + String.format("%.2f", sum));
		sc.close();
	}

}
