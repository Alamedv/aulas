package controller;

import model.Carro;

public class GerenciamentoCarro {

	public static void main(String[] args) {

		Carro c1 = new Carro("Mercedes", "cl300", 2020, false, 0);
		Carro c2 = new Carro("Aston Martin", "DBX 707", 2023, true, 0);
		Carro c3 = new Carro("BMW", "i3", 2023, true, 0);
		
		c1.detalhes();
		c2.detalhes();
		c3.detalhes();
	
		

		System.out.println();

		System.out.println(c1.ligarMotor());
		System.out.println(c2.situacaoMotor());
		System.out.println(c3.situacaoMotor());
		System.out.println();
		
		System.out.println(c1.acelerar(50));
		System.out.println(c2.acelerar(50));
		System.out.println(c3.acelerar(50));
		System.out.println();
		
		System.out.println(c1.frear(20));
		System.out.println(c2.frear(20));
		System.out.println(c3.frear(20));
		System.out.println();

		System.out.println(c1.situacaoMotor());
		System.out.println(c1.getVelocidade() + " km/h");

		System.out.println(c2.situacaoMotor());
		System.out.println(c2.getVelocidade()+ " km/h");
		
		System.out.println(c3.situacaoMotor());
		System.out.println(c3.getVelocidade()+ " km/h");
	}

}
