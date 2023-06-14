package listaExercicios;

import util.Teclado;

public class teste1 {
	/*
	 * Desenvolver um programa que crie uma matriz com 5 linhas e 3 colunas.
	 * Pergunte ao usuário o conteúdo desta matriz e ao final exiba a matriz inteira
	 */
	public static void main(String[] args) {

		int mat[][] = new int[5][3];
	
		for (int linha = 0; linha < 5; linha++) {
			for (int col = 0; col < 3; col++) {

				mat [linha] [col] = Teclado.lerInt("Informe a nota");
				
			}//fim do for coluna

		}//fim do for linha
		
		
		for (int linha = 0; linha < 5; linha++) {
			for (int col = 0; col < 3; col++) {

				System.out.println(mat[linha][col]);
			}
		}
	}

}
