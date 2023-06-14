package controller;

import model.Mamifero;

public class Test {

	public static void main(String[] args) {
		
		Animal animal1 = new Animal ();
		Animal animal2 = new Animal ();
		
		Mamifero cachorro = new Mamifero("terrestre", 4, "cachorro", "oi", "dwdww") {
		};
		
		
		animal1.setNumeroDePatas(4);
		animal1.setCobertoPor("pelos");
		animal1.setNomenclatura("cachorro");
		animal1.setReproducao("vivíparos");
		animal1.setAlimentacao("carnívoros");
		
		animal2.setNumeroDePatas(0);
		animal2.setCobertoPor("escamas");
		animal2.setNomenclatura("cobra");
		animal2.setReproducao("oviparos");
		
		
		System.out.println(cachorro);

		
	}

}
