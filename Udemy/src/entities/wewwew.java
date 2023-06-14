package entities;

import java.util.Scanner;

public class wewwew {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Qual sua idade?");
		int num = sc.nextInt();

		System.out.println("sua altura: ");
		double num2 = sc.nextDouble();

		System.out.println(nome);
		System.out.println(num);
		System.out.println(num2);
		
		
		
		
		
		sc.close();

	}

}
