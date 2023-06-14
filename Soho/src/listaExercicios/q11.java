package listaExercicios;

import java.util.Scanner;

public class q11 {
	/*
	 * Este exercício propõe a criação de um programa que leia o total de vendas de
	 * um distribuidor de refrigerantes por região e por trimestre, monte uma tabela
	 * com essas informações e, ao final, apresente um relatório com as informações
	 * de vendas por região em cada trimestre, além do total de vendas no ano
	 * inteiro por cada região e o total geral de vendas no ano pela empresa.
	 * 
	 * Para resolver esse exercício, podemos criar uma matriz com 5 linhas
	 * (representando as 5 regiões) e 4 colunas (representando os 4 trimestres do
	 * ano). Em seguida, o usuário pode informar os valores de vendas de cada região
	 * em cada trimestre. Depois disso, podemos calcular as somas das vendas por
	 * trimestre e por região e exibir o relatório com as informações solicitadas.
	 * 
	 * O relatório deve incluir:
	 * 
	 * as vendas por trimestre em cada região; as vendas totais por região no ano
	 * inteiro; as vendas totais da empresa no ano inteiro. Para apresentar as
	 * informações de forma clara, podemos utilizar loops e formatação de saída, por
	 * exemplo, utilizando o método printf do Java para formatar as informações e
	 * exibi-las em colunas.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int a [][] = new int [5][4];
		
				for (int vendas = 0; vendas <5; vendas ++) {
					int cont = 1; 
					System.out.println("Informe a quantidade de vendas do " + cont + " trimestre");
					
			for(int trime = 0; trime <4; trime ++) {
				a[vendas][trime] = sc.nextInt();
				cont++;
			}
			}
				
				for (int vendas = 0; vendas <5; vendas ++) {
					for(int trime = 0; trime <4; trime ++) {
						System.out.print(a[vendas][trime]);
					} 
					System.out.println();
					}
				
				
		sc.close();
		
	}

}
