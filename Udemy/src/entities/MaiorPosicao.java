package entities;

import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("Qnts vetores?");
		n = sc.nextInt();

		int veta[] = new int[n];
		int vetb[] = new int[n];
		int vetc[] = new int[n];

		for (int i = 0; i < veta.length; i++) {
			System.out.println("Digite os valores do vetor A: ");
			veta[i] = sc.nextInt();

		}

		for (int i = 0; i < vetb.length; i++) {
			System.out.println("Digite os valores do vetor b: ");
			vetb[i] = sc.nextInt();

		}

		System.out.println("Vetor Resultante: \n");
		for (int i = 0; i < veta.length; i++) {

			vetc[i] = veta[i] + vetb[i];
			System.out.println(vetc[i]);

		}
		

		sc.close();
	}

}
