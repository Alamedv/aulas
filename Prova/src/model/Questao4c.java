package model;

import java.util.Scanner;

public class Questao4c {
	/*
	 * c) Desenvolver um programa que pergunte ao usuário time de futebol que ele
	 * torce. Se o time informado for um dos 4 principais cariocas (Flamengo,
	 * Fluminense, Botafogo e Vasco), informar as cores oficiais do time apontado.
	 * Se o time não for um dos 4 principais cariocas, exibir a informação “Seu time
	 * não é um dos 4 principais times cariocas”. Use switch/case
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe seu time");

		String time = sc.nextLine();

		switch (time.toLowerCase()) { //formatação toLowerCase para transformar qualquer ResPosTa Do USUARIO Em LeTRAs "minuscula"!
		
		case "flamengo": //caso a resposta seja flamengo, imprima isto: 
			System.out.println("As cores oficiais do Flamengo são vermelho e preto.");

			break; //caso não:
			
		case "fluminense":
			System.out.println("As cores oficiais do Fluminense são verde, branco e grená");
			break;
		case "botafogo":
			System.out.println("As cores oficiais do Botafogo são branco e preto");
			break;
		case "vasco":
			System.out.println("As cores oficiais do vasco são preto e branco");
			break;
			
		default: //se não for nenhuma das condições acima, imprima isto: 
			System.out.println("Seu time não é um dos 4 principais times cariocas.");
		}

		sc.close();

	}

}
