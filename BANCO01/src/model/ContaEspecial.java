package model;

public class ContaEspecial extends Banco {

	public ContaEspecial(String cliente, int numeroAgencia, int numeroConta, double saldo, double limite) {
		super(cliente, numeroAgencia, numeroConta, saldo);
		this.limite = limite;
	}

	public ContaEspecial(String cliente, int numeroAgencia, int numeroConta, double saldo) {
		super(cliente, numeroAgencia, numeroConta, saldo);
	}

	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {

		return "NOME: " + this.getCliente() + "\n" + "AGÊNCIA: " + String.format("%08d", this.getNumeroAgencia()) + "\n"
				+ "CONTA: " + this.getNumeroAgencia() + "\n" + "SALDO: R$ " + this.getSaldo() + "\n"
				+ String.format("LIMITE DE CRÉDITO: R$ %.2f", this.getLimite()) + "\n-------------\n";

	}
}
