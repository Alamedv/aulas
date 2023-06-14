package entities;

import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("qnts elementos tem o vet?");
		n = sc.nextInt();
		double vet[] = new double[n];
		double media = 0;
		double soma = 0;

		for (int i = 0; i < vet.length; i++) {
			System.out.println("Digite um num: ");
			vet[i] = sc.nextDouble();
			soma += vet[i];
			media = soma / n;
		}
		System.out.printf("\nmedia do vetor = %.3f\n", media);
		System.out.println("\nElementos abaixo da média: \n");

		for (int i = 0; i < vet.length; i++) {
			if (vet[i] < media) {
				System.out.printf("%.1f\n", vet[i]);
			}

		}

		sc.close();
	}

}
