package entities;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		
		System.out.println("Informe a quantidade de vetores: ");
			n = sc.nextInt();
			
			int vet [] = new int [n];
			
			for (int i = 0; i < vet.length; i++) {
			
				System.out.println("Informe um numero: ");
				
				vet [i] = sc.nextInt();
				
			}
			
			for (int i = 0; i < vet.length; i++) {
				
				if (vet[i] < 0) {
					System.out.println(vet[i]);

				}
			}
				
		
		sc.close();
	}

}
