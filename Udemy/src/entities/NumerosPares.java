package entities;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("qnts num vc vai digitar?");
		int n = sc.nextInt();
		int soma = 0;
		int vet[] = new int[n];

		for (int i = 0; i < vet.length; i++) {
			System.out.println("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		System.out.println("Numeros pares: ");

		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 == 0) {
				System.out.print(vet[i] + " ");
			}
		}
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 == 0) {
				soma++;
			}

		}
		System.out.println("\n\nQuantidade de pares: " + (soma));

		sc.close();

	}

}
