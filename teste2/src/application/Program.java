package application;

import java.util.Scanner;

import entities.Carro;

/*
 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
	tela todos os números pares, e também a quantidade de números pares. 
 */
public class Program {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	

	Carro meuCarro;
	meuCarro = new Carro("Ford", "Fiesta", 2020);
	meuCarro.exibirDetalhes();
		
		sc.close();
	}

}
