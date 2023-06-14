package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a quantidade de vetores: ");
		int k = sc.nextInt();
		Product[] vect = new Product[k];

		for (int i = 0; i < vect.length; i++) {

			sc.nextLine();
			System.out.println("Informe o nome do produto");
			String name = sc.nextLine();
			System.out.println("Informe o preço do produto");
			Double price = sc.nextDouble();
			vect[i] = new Product(name, price);

		}

		double soma = 0;
		for (int i = 0; i < vect.length; i++) {
			soma = soma + vect[i].getPrice();
		}
		double avg = soma / vect.length;

		System.out.printf("avarage price = %.2f%n", avg);

		sc.close();
	}

}
