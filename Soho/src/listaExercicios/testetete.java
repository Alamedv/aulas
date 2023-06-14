package listaExercicios;

import java.util.Scanner;

public class testetete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a[][] = new int[3][5];

		System.out.println("Informe os numeros da tabela A");
		for (int l = 0; l < 3; l++) {

			for (int col = 0; col > 5; col++) {
				a[l][col] = sc.nextInt();

				System.out.print(a[l][col]);
			}
			System.out.println();
		}

		sc.close();
	}



}
