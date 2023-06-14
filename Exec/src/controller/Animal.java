package controller;

public abstract class Animal {

	private String nomenclatura;
	private int numeroDePatas;
	private String cobertoPor;
	private String reproducao;
	private String alimentacao;

	public void tipoDeRespiracao() {
	}

	public void temperaturaCorporal() {

	}

	public void bixo() {

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

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String nomenclatura, int numeroDePatas, String cobertoPor, String reproducao, String alimentacao) {
		super();
		this.nomenclatura = nomenclatura;
		this.numeroDePatas = numeroDePatas;
		this.cobertoPor = cobertoPor;
		this.reproducao = reproducao;
		this.alimentacao = alimentacao;
	}

	@Override
	public String toString() {
		return "Animal [nomenclatura= " + nomenclatura + ", numeroDePatas= " + numeroDePatas + ", cobertoPor= "
				+ cobertoPor + ", reproducao= " + reproducao + ", alimentacao= " + alimentacao + "]";
	}

	public void exibir() {

		System.out.println("\nCARACTERÍSTICAS DO ANIMAL:\n");
		System.out.println("NOMENCLATURA: " + nomenclatura);
		System.out.println("NUMERO DE PATAS: " + numeroDePatas);
		System.out.println("ALIMENTAÇÃO: " + alimentacao);
		System.out.println("COBERTO POR: " + cobertoPor);
		tipoDeRespiracao();
		temperaturaCorporal();
		bixo();
		habitat();
		System.out.println("--------------------------");

	}

	public void habitat() {
	}

}
