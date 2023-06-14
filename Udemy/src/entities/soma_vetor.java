package entities;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double media = 0, soma = 0;
		int n;
		System.out.println("Informe a quantidade de pessoas: ");
		n = sc.nextInt();

		double altura[] = new double[n];
		int idade[] = new int[n];
		String nome[] = new String[n];
		double perc = 0;

		for (int i = 0; i < n; i++) {
	    	System.out.printf("%nDados da %d° pessoa:%n", i+1);
	    	System.out.printf("nome: ");
			nome[i] = sc.next();
			System.out.println("Informe a idade da pessoa: ");
			idade[i] = sc.nextInt();
			System.out.println("Informe a altura: ");
			altura[i] = sc.nextDouble();

			soma += altura[i];

		}
		media = soma / n;
int cont = 0;
		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
cont++;
				perc = cont * 100.0 / n;

				System.out.println("nome: " + nome[i]);
			}

		}
		System.out.println("Percentual de pessoas com menos de 16 anos: " + perc);
		System.out.print("Altura média: " + String.format("%.2f", media));

		sc.close();
	}
}