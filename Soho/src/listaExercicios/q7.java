package listaExercicios;

public class q7 {
	/*
	 * Desenvolva um programa que gere e exiba a matriz abaixo: 11 12 13 14 15 16 17
	 * 18 19 20 21 22
	 */
	public static void main(String[] args) {

		int m[][] = new int[3][4];
		int valor = 11;

		for (int linha = 0; linha < 3; linha++) {
			for (int col = 0; col < 4; col++) {

				m[linha][col] = valor++;

			}
		}
		for (int linha = 0; linha < 3; linha++) {
			for (int col = 0; col < 4; col++) {

				System.out.print(m[linha][col] + " ");
			}
			System.out.println();
}
	}

}
