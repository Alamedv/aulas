package listaExercicios;

import util.Teclado;

public class q2 {
	/*
	 * Desenvolver um programa que crie uma matriz com 3 linhas e 2 colunas.
	 * Pergunte ao usuário números para preencher toda a matriz, e ao final exiba a
	 * matriz inteira e também a soma dos números desta matriz.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m[][] = new int[3][2];
		int soma = 0;

		for (int linha = 0; linha < 3; linha++) {
			for (int col = 0; col < 2; col++) {

				m[linha][col] = Teclado.lerInt("informe um numero: ");
				soma = soma + m[linha][col];

			}
		}

		for (int linha = 0; linha < 3; linha++) {
			for (int col = 0; col < 2; col++) {

			}

		}

		System.out.println(soma);
	}
}
