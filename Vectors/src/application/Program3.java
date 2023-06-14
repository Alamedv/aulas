package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program3 {
	/*
	 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme
	 * exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar também
	 * a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas
	 * pessoas caso houver.
	 * 
	 */
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double media = 0, somaAltura = 0, perc;
		System.out.println("Informe a quantidade de pessoas: ");
		int n = sc.nextInt();
		Product vet[] = new Product[n];

		for (int i = 0; i < vet.length; i++) {
			System.out.println("Informe o nome da pessoa:");
			String name = sc.next();
			System.out.println("Informe a idade da pessoa:");
			int idade = sc.nextInt();
			System.out.println("Informe a altura da pessoa:");
			double altura = sc.nextDouble();
			vet[i] = new Product(idade, name, altura);
		}

		for (int i = 0; i < vet.length; i++) {
			somaAltura = vet[i].getAltura();
			media = somaAltura / n;
		}
		
		int cont = 0;
		for (int i = 0; i < vet.length; i++) {
			cont++;


			if (vet[i].getIdade() < 16)
			System.out.println(vet[i].getIdade());
			System.out.println(vet[i].getAltura());
			System.out.println(vet[i].getIdade());

		}
		perc = cont * 100 / n;
		System.out.println(perc);
		System.out.println(media);
		sc.close();
	}

}
