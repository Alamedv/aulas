package entities;

import java.util.Scanner;

public class Pensionato {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int quarto[] = new int[10];
		String nome[] = new String[10];
		String mail[] = new String[10];
		int n;

		System.out.println("Há quantos estudantes? ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Informe o quarto a ser ocupado: ");
			quarto[i] = sc.nextInt();

			System.out.println("Informe o nome do cliente: ");
			nome[i] = sc.next();

			System.out.println("Informe o e-mail do cliente: ");
			mail[i] = sc.next();

		}

		for (int i = 0; i < n; i++) {
			
			System.out.println("Quarto ocupado: " + quarto[i] + " " + "\nE:mail: " + mail[i] + "\nNome: " + nome[i] + "\n");
		}
		
			
		
		sc.close();

	}

}
