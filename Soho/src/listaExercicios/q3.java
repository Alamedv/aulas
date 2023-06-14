package listaExercicios;

import util.Teclado;

public class q3 {
	/*
	 * Desenvolver um programa que crie uma matriz de 4 linhas e 3 colunas. Pergunte
	 * ao usuário números para preencher toda a matriz, e ao final, exiba a matriz
	 * inteira e a soma dos números pares contidos na matriz
	 */
	public static void main(String[] args) {

		int m[][] = new int[4][3];
int soma = 0;
		for (int linha = 0; linha < 4; linha++) {
			for (int col = 0; col < 3; col++) {

				m[linha][col] = Teclado.lerInt("informe um numero");

				if (m[linha][col] % 2 ==0) {
					soma = soma + m[linha][col];
				}
				
			}

		}

		System.out.println("kakak ");

		for (int linha = 0; linha < 4; linha++) {
			for (int col = 0; col < 3; col++) {

				System.out.print(m[linha][col] + " ");

			}
			System.out.println();
		}

	}

}
