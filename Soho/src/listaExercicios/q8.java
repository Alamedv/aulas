package listaExercicios;

import java.util.Scanner;

public class q8 {
	/*
	 * Desenvolver um programa que pergunte o conteúdo de duas matrizes a e b, cada
	 * uma com 5 linhas e 3 colunas, construa uma matriz c de mesma dimensão, a qual
	 * é formada pela soma dos elementos da matriz a com a matriz b. Apresentar ao
	 * final o conteúdo das três matrizes.
	 */
	public static void main(String[] args) {

		
		        int[][] a = new int[5][3];
		        int[][] b = new int[5][3];
		        int[][] c = new int[5][3];

		        Scanner sc = new Scanner(System.in);

		        System.out.println("Digite os valores da matriz A: ");
		        for (int i = 0; i < 5; i++) {
		            for (int j = 0; j < 3; j++) {
		                a[i][j] = sc.nextInt();
		            }
		        }

		        System.out.println("Digite os valores da matriz B: ");
		        for (int i = 0; i < 5; i++) {
		            for (int j = 0; j < 3; j++) {
		                b[i][j] = sc.nextInt();
		            }
		        }

		        for (int i = 0; i < 5; i++) {
		            for (int j = 0; j < 3; j++) {
		                c[i][j] = a[i][j] + b[i][j];
		            }
		        }

		        System.out.println("Matriz A:");
		        printMatriz(a);

		        System.out.println("Matriz B:");
		        printMatriz(b);

		        System.out.println("Matriz C (A + B):");
		        printMatriz(c);

		        sc.close();
		    }

		    public static void printMatriz(int[][] matriz) {
		        for (int i = 0; i < 5; i++) {
		            for (int j = 0; j < 3; j++) {
		                System.out.print(matriz[i][j] + " ");
		            }
		            System.out.println();
		        }
		    }
		}
