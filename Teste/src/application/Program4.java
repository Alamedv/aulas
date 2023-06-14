package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;


public class Program4 {
	/*
	 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em
	 * seguida, mostre na tela todos os números pares, e também a quantidade de
	 * números pares.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o numero de vetores");
		int n = sc.nextInt();
		Product vet [] = new Product [n];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Informe um numero");
			int nume = sc.nextInt();
		}
		
			for (int i = 0; i<vet.length; i++) {
				if (vet[i].getNume() % 2 == 0) {
					System.out.println(vet[i].getNume());
	}
			}
				
		sc.close();
	}

}
