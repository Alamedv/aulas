package model;

public class Carro {

	public Carro(String fabricante, String modelo, int ano) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.motorLigado = false;
		this.velocidade = 0;
	}

	public Carro(String fabricante, String modelo, int ano, boolean motorLigado, int velocidade) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.motorLigado = motorLigado;
		this.velocidade = velocidade;
	}

	public Carro() {
		super();
	}

	public String frear(int valor) {

		if (this.motorLigado) {
			if (this.velocidade == 0) {
				return this.modelo + " --> O carro já está parado!";
			}
			if (this.motorLigado) {
				this.velocidade -= valor;
				if (this.velocidade < 0) {
					this.velocidade = 0;
				}
				return this.modelo + " --> Freou! Velocidade atual: " + this.velocidade + " km/h";
			}
		}
		return this.modelo + " --> O carro está desligado!";
	}

	public String acelerar(int valor) {

		if (this.motorLigado) {
			this.velocidade += valor;
			return this.modelo + " --> Acelerou! Velocidade atual: " + this.velocidade + " km/h";
		}
		return this.modelo + " O carro está desligado!";
	}

	public String desligarMotor() {
		if (!this.motorLigado) {
			return this.modelo + " --> O motor do " + this.modelo + " estava desligado";
		}
		if (this.velocidade == 0) {
			this.motorLigado = false;
			return this.modelo + " --> O motor do " + this.modelo + " foi desligado";
		}
		return this.modelo + " --> O motor está ligado pois o carro está em movimento";
	}

	public String ligarMotor() {
		if (this.motorLigado) {
			return this.modelo + "--> O motor do " + this.modelo + " estava ligado";
		}
		this.motorLigado = true;
		return this.modelo + " --> O motor do " + this.modelo + " estava desligado";
	}

	public String situacaoMotor() {
		if (this.motorLigado) {
			return this.fabricante + "--> Motor LIGADO.";
		}
		return this.fabricante + "--> Motor DESLIGADO.";
	}

	public void detalhes() {
		System.out.println("---carro---");
		System.out.println("Fabricante: " + this.fabricante);
		System.out.println("modelo: " + this.modelo);
		System.out.println("ano: " + this.ano);
		System.out.println();
	}

	private String fabricante;
	private String modelo;
	private int ano;
	private boolean motorLigado;
	private int velocidade;

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
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

}
