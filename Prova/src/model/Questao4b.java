package model;

import java.util.Locale;
import java.util.Scanner;

public class Questao4b {
	/*
	 * b) Fazer um algoritmo que pergunte o nome de um estado brasileiro, e ao
	 * final, informe na tela se o estado inserido está ou não na região Sudeste.
	 * (use if)
	 */
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome de algum estado brasileiro: ");

		String est = sc.nextLine();

		
		if (est.equals("RJ") || est.equals("SP") || est.equals("ES") || est.equals("MG")) { //utiliza-se || para situações condicionais, para quando mais de uma resposta for verdadeira!
			System.out.println("O estado informado fica na região Sudeste");
		} else {
			System.out.println("O estado informado não fica na região Sudeste");
		}

		sc.close();

	}

}
