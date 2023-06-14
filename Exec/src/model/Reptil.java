package model;

import controller.Animal;

public class Reptil extends Animal implements IAnimal {

	@Override
	public String toString() {
		return "Reptil [capacidadeRegenerativa = " + buleano() + ", Nomenclatura = " + getNomenclatura()
				+ ", NumeroDePatas = " + getNumeroDePatas() + ", CobertoPor = " + getCobertoPor() + ", Reproducao = "
				+ getReproducao() + ", Alimentacao = " + getAlimentacao() + "]"
				+ " \n------------------------------------------------------------------------------------------------------------------------------------------------";
	}

	public boolean isCapacidadeRegenerativa() {
		return capacidadeRegenerativa;
	}

	public void tipoDeRespiracao() {
		System.out.println("Respiração do tipo: traquial");
	}

	private String buleano() {
		if (!capacidadeRegenerativa) {
			return "falso";
		} else {
			return "verdadeiro";
		}
	}

	public void setCapacidadeRegenerativa(boolean capacidadeRegenerativa) {
		this.capacidadeRegenerativa = capacidadeRegenerativa;
	}

	public Reptil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reptil(String nomenclatura, int numeroDePatas, String cobertoPor, String reproducao, String alimentacao,
			boolean capacidadeRegenerativa) {
		super(nomenclatura, numeroDePatas, cobertoPor, reproducao, alimentacao);
		this.capacidadeRegenerativa = capacidadeRegenerativa;
		// TODO Auto-generated constructor stub
	}

	private boolean capacidadeRegenerativa;

	@Override
	public void bixo() {
		System.out.println("bixo do mato");

	}

	@Override
	public void habitat() {

	}

	@Override
	public void temperaturaCorporal() {
		System.out.println("Respiração do tipo: Pecilotérmico");

	}
}
