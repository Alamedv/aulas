package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	/*
	 * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois
	 * N números inteiros e armazene-os em um vetor. Em seguida, mostrar na tela
	 * todos os números negativos lidos.
	 * 
	 */
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o numero de vetores: ");
		int n = sc.nextInt();
		int vect [] = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Informe um numero: ");
			vect[i] = sc.nextInt();
					
		}
			
		for (int i =0; i < n; i++) {
		if (vect[i] <0) {
			System.out.println("Os numeros negativos são: " + vect[i]);			}

		}
		
		sc.close();

	}

}
