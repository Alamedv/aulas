package listaExercicios;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][5];
        int[] b = new int[5];

        // Preenche a matriz a com valores fornecidos pelo usuário
        
        System.out.println("Digite os valores para preencher a matriz a:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Calcula a soma de cada coluna da matriz e armazena no vetor b
        
        for (int j = 0; j < 5; j++) {
            int soma = 0;
            for (int i = 0; i < 3; i++) {
                soma = soma + a[i][j];
            }
            b[j] = soma;
        }

        // Exibe a matriz a e o vetor b
        System.out.println("Matriz a:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Vetor b:");
        for (int j = 0; j < 5; j++) {
            System.out.print(b[j] + " ");
        }
        System.out.println();

        sc.close();
    }
}