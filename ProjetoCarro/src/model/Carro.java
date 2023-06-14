package model;

public class Carro {
	
	private String fabricante;
	private String modelo;
	private boolean motorLigado;
	private int velocidade;
	private int ano;
	
	public Carro(String fabricante, String modelo, boolean motorLigado, int velocidade, int ano) {

		this.fabricante = fabricante;
		this.modelo = modelo;
		this.motorLigado = motorLigado;
		this.velocidade = velocidade;
		this.ano = ano;
	}

	public Carro() {
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public Carro(String fabricante, String modelo, int ano) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
	}

		
	
	public void detalhes () {
		System.out.println("--- metodo detalhes---");
		System.out.println("fabricante " + this.fabricante);
		System.out.println("Modelo " + this.modelo);
		System.out.println("ano " + this.ano);
		System.out.println("Motor ligado " + this.motorLigado);
		System.out.println("velocidade: " + this.velocidade);
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isMotorLigado() {
		return motorLigado;
	}

	public void setMotorLigado(boolean motorLigado) {
		this.motorLigado = motorLigado;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}
