package model;

public class Questao4e {
	/*
	 * Desenvolva um programa que gere uma matriz 3 x 4 vazia, preencha-a através de
	 * rotinas de repetição (laços) com os valores abaixo e exiba-a: (faça com os 3
	 * laços)
	 * 
	 * 50 51 52 53 54 55 56 57 58 59 60 61
	 * 
	 */
	public static void main(String[] args) {

		
		//nao entendi o que ele quis dizer com fazer com os 3 laços, enfim: 
		
		int vet [][] = new int [3][4]; //formula pra criaçao de tabela
		int num = 50; //iremos trabalhar com o primeiro numero da matriz somente
		
		for (int i = 0; i < 3; i++) { //aqui somaremos a variavel NUM
			for (int n = 0; n < 4; n++) { 
				vet[i][n] = num; 
				num++;
			}
		
		}
		
		for (int i = 0; i < 3; i++) { //esse é pra exibir em formato de tabela
            for (int n = 0; n < 4; n++) {
                System.out.print(vet[i][n] + " "); 
            }
            System.out.println(); //importante esse sysout em branco pra pular a linha depois do fechamento do segundo laço

		} //esse ultimo colchete é o final do laço for, antes dele utilizaremos uma quebra de linha (que acontecerá a cada 4 voltas (depois do 53, 57, 61)
		
	}

}
