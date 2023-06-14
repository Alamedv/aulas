package controller;

public class Animal {

	public Animal() {
		super();
	}

	
	private String nomenclatura;
	private int numeroDePatas;
	private String cobertoPor;
	private String reproducao;
	private String alimentacao;
	private boolean capacidadeRegenerativa;

	public boolean isCapacidadeRegenerativa() {
		return capacidadeRegenerativa;
	}
	public void setCapacidadeRegenerativa(boolean capacidadeRegenerativa) {
		this.capacidadeRegenerativa = capacidadeRegenerativa;
	}
	
	public Animal(String nomenclatura, int numeroDePatas, String cobertoPor, String reproducao, String alimentacao) {
		super();
		this.nomenclatura = nomenclatura;
		this.numeroDePatas = numeroDePatas;
		this.cobertoPor = cobertoPor;
		this.reproducao = reproducao;
		this.alimentacao = alimentacao;
	}

	public String getNomenclatura() {
		return nomenclatura;
	}

	public void setNomenclatura(String nomenclatura) {
		this.nomenclatura = nomenclatura;
	}

	public int getNumeroDePatas() {
		return numeroDePatas;
	}

	public void setNumeroDePatas(int numeroDePatas) {
		this.numeroDePatas = numeroDePatas;
	}

	public String getCobertoPor() {
		return cobertoPor;
	}

	public void setCobertoPor(String cobertoPor) {
		this.cobertoPor = cobertoPor;
	}

	public String getReproducao() {
		return reproducao;
	}

	public void setReproducao(String reproducao) {
		this.reproducao = reproducao;
	}

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}
	@Override
	public String toString() {
		return "Animal [nomenclatura=" + nomenclatura + ", numeroDePatas=" + numeroDePatas + ", cobertoPor="
				+ cobertoPor + ", reproducao=" + reproducao + ", alimentacao=" + alimentacao
				+ ", capacidadeRegenerativa=" + capacidadeRegenerativa + "]";
	}

}
