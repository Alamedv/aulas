package listaExercicios;

import java.util.Locale;
import java.util.Scanner;

public class q555 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		double[] vect = new double[K];
		double avg = 0;

		for (int i = 0; i < K; i++) {
			vect[i] = sc.nextDouble();
		}

		double soma = 0;

		for (int i = 0; i < K; i++) {
			soma += vect[i];
		}

		avg = soma / K;

		System.out.println("Avg height: " + avg);

		sc.close();
	}

}
