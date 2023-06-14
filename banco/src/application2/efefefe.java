package application2;

import java.util.Locale;
import java.util.Scanner;

public class efefefe {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] vect = new double[n];
		double avg = 0;

		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}

		double soma = 0;

		for (int i = 0; i < n; i++) {
			soma += vect[i];
		}

		avg = soma / n;

		System.out.println("Avg height: " + avg);

		sc.close();
	}

}
