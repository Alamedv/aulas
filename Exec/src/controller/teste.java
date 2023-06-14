package controller;

import model.Mamifero;
import model.Reptil;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * jacare: réptil de 4 patas, coberto por escamas, reprodução tipo ovíparo, alimentação carnívoro, não possui capacidade regenerativa.
		 */
		
		Reptil jacare = new Reptil("jacaré", 4, "escamas", "oviparo", "carnivoro", false);
		
		Mamifero cachorro = new Mamifero("cachorro", 4, "pelos", "viviparo", "carnivoro", "terrestre");
		Reptil lagartixa = new Reptil("Lagartixa", 4, "escamas", "oviparo", "herbivoro", true);
		Mamifero baleia = new Mamifero("baleia", 0, "pele", "viviparo", "carnivoro", "aquatico");
		
		
		baleia.exibir();
		cachorro.exibir();
		lagartixa.exibir();
		jacare.exibir();
	}

}
