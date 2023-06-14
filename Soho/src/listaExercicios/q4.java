package listaExercicios;

import util.Teclado;

public class q4 {
	/*
	 * Desenvolver um programa que crie uma matriz de 5 linhas e 2 colunas. Pergunte
	 * ao usuário números para preencher toda a matriz, e ao final, exiba a matriz
	 * inteira e a média dos números da matriz.
	 */
	public static void main(String[] args) {

		double m[][] = new double [5][2];
		double media, soma = 0;

		for (int linha = 0; linha < 5; linha++) {
			for (int col = 0; col < 2; col++) {

				m[linha][col] = Teclado.lerInt("Informe um numero: ");
				soma = soma + m[linha][col];
			}
		}
		media = soma / 10;

		for (int linha = 0; linha < 5; linha++) {
			for (int col = 0; col < 2; col++) {

				System.out.print(m[linha][col] + " ");

			}
			System.out.println();

		}
		System.out.println(media);

	}// fim

}
