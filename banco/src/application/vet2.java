package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class vet2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();

		Product vec[] = new Product[k];

		for (int i = 0; i < vec.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			Double price = sc.nextDouble();
			vec [i]  = new Product (name, price);
		}

		double soma = 0;
		
		for (int i = 0; i <vec.length; i++) {
			soma += vec[i].getPrice();
		}
		double media = soma /k;
		
		System.out.printf("Average price %2.f%n", media);
		
		
		sc.close();
	}

}
