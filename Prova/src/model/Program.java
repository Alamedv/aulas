package model;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n;
		
		do {
			System.out.println("informe um numero maior que 20: ");
			n = sc.nextInt();
			
		} while (n<= 20);
		System.out.println("Sequencia de numeros pares existente entre 2 e " + n +":");

		
		for (int i = 2; i <= n; i+=2) {
			System.out.println(i);
		}
		
		sc.close();
		
	}

}
