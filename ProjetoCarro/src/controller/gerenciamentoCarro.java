package controller;

import model.Carro;

public class gerenciamentoCarro {

	public static void main(String[] args) {

		Carro c1 = new Carro();

		c1.setFabricante("pica pau");
		c1.setModelo("fusca");
		c1.setAno(1972);
		c1.setMotorLigado(false);
		c1.setVelocidade(0);

		Carro c2 = new Carro ("VW", "Kombi", 1980);
		Carro c3 = new Carro ("Chevrolet", "Opala", 1982);
		Carro c4 = new Carro ("Mercedes", "cla400", 2010);

		
		
		c1.detalhes();

		c2.detalhes();

		c3.detalhes();
		
		c4.detalhes();
	}

}
