package model;

import controller.Animal;

public class Mamifero extends Animal implements IAnimal {
	
	private String habitat;

	public Mamifero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mamifero(String nomenclatura, int numeroDePatas, String cobertoPor, String reproducao, String alimentacao,
			String habitat) {
		super(nomenclatura, numeroDePatas, cobertoPor, reproducao, alimentacao);
		this.habitat = habitat;
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Mamifero [habitat = " + habitat + ", Nomenclatura = " + getNomenclatura() + ", NumeroDePatas = "
				+ getNumeroDePatas() + ", CobertoPor = " + getCobertoPor() + ", Reproducao = " + getReproducao()
				+ ", Alimentacao = " + getAlimentacao() + "]"
				+ " \n------------------------------------------------------------------------------------------------------------------------------------------------";
	}

	public void tipoDeRespiracao() {
		System.out.println("Respiração do tipo: pulmonar");
	}

	@Override
	public void temperaturaCorporal() {
		System.out.println("temperatura corporal: Homeotérmico");

	}

	@Override
	public void bixo() {
		System.out.println("as vezes adestrado");

	}

	@Override
	public void habitat() {
		System.out.println("habitat natural: " + this.habitat);
		
	}
}
