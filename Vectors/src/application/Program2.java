package application;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
	/*
	 * Faça um programa que leia N números reais e armazene-os em um vetor. Em
	 * seguida: - Imprimir todos os elementos do vetor - Mostrar na tela a soma e a
	 * média dos elementos do vetor
	 * 
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double media = 0;
		double soma = 0;

		System.out.println("Informe a quantidade de vetores");

		int n = sc.nextInt();
		double vet[] = new double [n];
		for (int i = 0; i < vet.length; i++) {
			System.out.println();

			System.out.println("Informe um numero");
			vet[i] = sc.nextInt();
			soma += vet[i];

			media = soma / vet.length;

		}

		System.out.println("A soma e dos numeros:" + soma);
		System.out.println("A media e dos numeros: " + media);

		sc.close();
	}

}
