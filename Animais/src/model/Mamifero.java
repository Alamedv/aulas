package model;

import controller.Animal;

public abstract class Mamifero extends Animal {

	public Mamifero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mamifero(String nomenclatura, int numeroDePatas, String cobertoPor, String reproducao, String alimentacao) {
		super(nomenclatura, numeroDePatas, cobertoPor, reproducao, alimentacao);
		// TODO Auto-generated constructor stub
	}

	public Mamifero(String habitat) {
		super();
		this.habitat = habitat;
	}

	private String habitat;

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	@Override
	public String toString() {
		return "Mamifero - habitat=" + habitat + " // " + super.toString();
	}

}
