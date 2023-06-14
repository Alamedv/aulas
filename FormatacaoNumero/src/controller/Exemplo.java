package controller;

import java.text.NumberFormat;

public class Exemplo {

	public static void main(String[] args) {
		NumberFormat f = NumberFormat.getCurrencyInstance();
		double valor = 55008.537;
		System.out.println("Sem formatação: " + valor);
		System.out.println("Formatado: " + f.format(valor));
		NumberFormat p = NumberFormat.getPercentInstance();
		double porcento = 0.05;
		System.out.println("Sem formatação: " + porcento);
		System.out.println("Formatado: " + p.format(porcento));
		
		
	}

}
