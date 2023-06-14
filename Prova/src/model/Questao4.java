package model;

import java.util.Scanner;

public class Questao4 {
	/*
	 * 4) Faça os algoritmos abaixo: Fazer um algoritmo que pergunte um valor e
	 * exiba como resposta este valor com acréscimo de 18% e também o mesmo valor
	 * inicial com desconto de 65%.
	 * 
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // se lembre sempre de colocar essa formula no inicio!

		System.out.println("Informe um valor: ");
		int n = sc.nextInt(); //aqui salvaremos a proxima coisa que o usuario digitar!

		double acre = 1.18 * n; // utilizaremos a variavel double pois iremos multiplicar numeros decimais. Para adicionar 18% em uma conta basta multiplicar por 1.18!
		double desc = n * 0.65; // Para saber a porcentagem de alguma conta basta multiplicar por 0.X (sendo X o numero da porcentagem).
		
		System.out.println();
		System.out.println("Valor informado: " + n);
		System.out.printf("O valor de " + n + " acrescido de 18%% é: %.2f", acre); 
		System.out.println();
		System.out.printf("O valor " + n + " com desconto de 65%% é: %.2f", desc);

		sc.close(); //lembre-se sempre de fechar seu Scanner deixando-o por ultimo!

	}

}
