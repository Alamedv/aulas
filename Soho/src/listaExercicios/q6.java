package listaExercicios;

import util.Teclado;

public class q6 {
	/*
	 * Desenvolver um programa que crie uma matriz com 3 linhas e 5 colunas. As 4
	 * primeiras colunas de todas as linhas deverão ser preenchidas com números
	 * informados pelo usuário. A 5ª coluna deverá receber a média dos 4 valores
	 * existentes na mesma linha (das 4 primeiras colunas). Ao final exiba toda a
	 * matriz.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m[][] = new int[3][5];

		for (int linha = 0; linha < 3; linha++) {
			for (int col = 0; col < 4; col++) {

				m[linha][col] = Teclado.lerInt("Informe um numero: ");

			}
		}

		for (int linha = 0; linha < 3; linha++) {
			int soma = 0;
			for (int col = 0; col < 4; col++) {
				soma = soma + m[linha][col];
				m[linha][4] = soma;

			}
		}

		for (int linha = 0; linha < 3; linha++) {

			for (int col = 0; col < 5; col++) {

				System.out.print(m[linha][col] + " ");
			}
			System.out.println();

		}
	}

}
