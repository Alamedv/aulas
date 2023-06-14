package model;

public class Banco {

	private String Cliente;
	private int numeroAgencia;
	private int numeroConta;
	protected double saldo;

	public String depositar(double valor) {

		this.saldo += valor;

		return String.format("Depósito efetuado. \nSaldo atual: R$ %.2f\n", this.saldo);
	}

	public Banco(String cliente, int numeroAgencia, int numeroConta, double saldo) {
		super();
		Cliente = cliente;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public double saque(double valor) {
		if (valor > this.saldo) {
			String mensagem = "O saque não foi efetuado pois não há saldo suficiente.\nSaldo atual: R$: ";
			System.out.print(mensagem);
			return this.saldo;
		}
		this.saldo -= valor;
		String mensagem2 = "Saque efetuado! \nSaldo atual: R$: ";
		System.out.print(mensagem2);
		return this.saldo;
	}

	public String toString() {

		return "\nNOME: " + this.Cliente + "\n" + "AGÊNCIA: " + String.format("%08d", this.numeroAgencia) + "\n"
				+ "CONTA: " + this.numeroConta + "\n" + "SALDO: R$ " + this.saldo + "\n-------------\n";

	}

	public String getCliente() {
		return Cliente;
	}

	public void setCliente(String cliente) {
		Cliente = cliente;
	}

	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Banco() {

	}

public double calcNovoSaldo (double valor) {
		
		this.saldo = valor / 100 * this.saldo + this.saldo;
	    
		String mensagem2 = "Novo saldo com rendimento: ";
	    System.out.print(mensagem2 + this.Cliente + " - R$ ");
	    
	    return this.saldo;
		
	}
	
}
