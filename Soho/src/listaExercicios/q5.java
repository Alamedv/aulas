package listaExercicios;

import util.Teclado;

public class q5 {
	/*
	 * Desenvolver um programa que crie uma matriz de 4 linhas e 4 colunas. Pergunte
	 * ao usuário nomes de pessoas para preencher toda a matriz. Em seguida o
	 * programa perguntará ao usuário as coordenadas (linha e coluna) que deseja
	 * visualizar o conteúdo correspondente na matriz. Enquanto o usuário informar
	 * coordenadas válidas, o programa exibirá o conteúdo correspondente. No momento
	 * em que forem inseridas coordenadas não válidas o programa será encerrado com
	 * a mensagem na tela “Coordenadas inválidas”.
	 */
	public static void main(String[] args) {
		
		
		int l, c;
		String m [][] = new String [2][2];
		
		for (int linha = 0; linha <2; linha ++) {
			for (int col = 0; col <2; col++) {
			
				m [linha] [col]= Teclado.lerTexto("Informe um nome");
				
			}
		}
		
			
		do {
			l = Teclado.lerInt("informe a posição da linha");
			c = Teclado.lerInt("Informe a posição da coluna");
			
			if ((l >= 0 && l <= 1) && (c >=0 && c <= 1)) {
				
				System.out.println("Na posição [" + l + "] " + " e na coluna [" + c + "] está arquivado o nome: " + m[l][c]);
			}
			
		} while ((l >= 0 && l <= 1) && (c >=0 && c <= 1));
		
			System.out.println("coordenadas invalidas");
		}
		}
