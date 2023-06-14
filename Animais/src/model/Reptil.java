package model;

import controller.Animal;

public class Reptil extends Animal {

	public Reptil(boolean capacidadeRegenerativa) {
		super();
		this.capacidadeRegenerativa = capacidadeRegenerativa;
	}

	public boolean isCapacidadeRegenerativa() {
		return capacidadeRegenerativa;
	}

	public void setCapacidadeRegenerativa(boolean capacidadeRegenerativa) {
		this.capacidadeRegenerativa = capacidadeRegenerativa;
	}

	private boolean capacidadeRegenerativa;
	
}
