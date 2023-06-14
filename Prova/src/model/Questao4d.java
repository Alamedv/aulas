package model;

import java.util.Scanner;

public class Questao4d {
	/*
	 * Desenvolver um programa que pergunte ao usuário dez elementos de um vetor a,
	 * construa um vetor b do mesmo tipo, observando a seguinte lei de formação: se
	 * o valor do índice for par, o elemento deve ser multiplicado por 5; sendo
	 * ímpar, deve ser somado a 5. Ao final, mostrar os conteúdos dos dois vetores.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int vetA[] = new int [10]; //criação dos vetores
		int vetB[] = new int [10];
		
		for (int i = 0; i < 10; i++) { //laço que calcula vetor A posição por posição
			
			System.out.println("Informe um numero: ");	
			vetA[i] = sc.nextInt(); 
		}
		
		for (int i = 0; i < 10; i++) { // laço que calcula o vetor B
			if (vetA[i] %2 == 0) {	// primeira condição, se for numero par (%2 == 0), multiplica por 5;
				vetB[i] = vetA[i] * 5;	
				
			} else {
				vetB[i] = vetA[i] + 5; // caso a condição de cima não seja verdadeira, some 5;
			}
		}
		
		for (int i = 0; i < 10; i++) {
				System.out.print("Vetor A: " + vetA[i] + "      "); // ultimo laço feito, agora pra imprimir os vetores. Preste atenção na PRINT sem o LN nessa linha!
				System.out.println("Vetor B: " + vetB[i] + " ");	
			}			
		
		sc.close();
	}

}
