package listaExercicios;

import java.util.Scanner;

public class q9 {
	/*
	 * Desenvolver um programa que pergunte o conteúdo de uma matriz a com 3 linhas
	 * e 4 colunas. Em seguida preencha a matriz b de mesma dimensão com os valores
	 * da matriz a elevados ao quadrado. Ao final exiba o conteúdo das duas matrizes
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a[][] = new int[3][4];

		double quadrado;

		System.out.println("Informe um digito da matriz A: ");
		for (int l = 0; l < 3; l++) {
			for (int col = 0; col < 4; col++) {
				a[l][col] = sc.nextInt();
			}
		}
		System.out.println("Matriz A ao quadrado: ");
		for (int l = 0; l < 3; l++) {
			for (int col = 0; col < 4; col++) {

				quadrado = Math.pow(a[l][col], 2);

				System.out.print(quadrado + " ");

			}

			System.out.println();
		}

		sc.close();
	}

}
