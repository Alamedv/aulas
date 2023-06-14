package model;

public class ContaPoupanca extends Banco {
	

	
	public ContaPoupanca(String cliente, int numeroAgencia, int numeroConta, double saldo, int diaDeRecebimento) {
		super(cliente, numeroAgencia, numeroConta, saldo);
		this.diaDeRecebimento = diaDeRecebimento;
	}

	public ContaPoupanca(String cliente, int numeroAgencia, int numeroConta, double saldo) {
		super(cliente, numeroAgencia, numeroConta, saldo);
	}
	
	@Override
	public String toString() {

		return "NOME: " + this.getCliente() + "\n"+ "AGÊNCIA: " +  String.format("%08d",this.getNumeroAgencia()) + "\n"+ "CONTA: " + this.getNumeroAgencia() + "\n"+ "SALDO: R$ "+ this.getSaldo() + "\n" + "DATA DE RECEBIMENTO: " + this.diaDeRecebimento + "\n-------------\n";
		
	}
	private int diaDeRecebimento;

	public int getDiaDeRecebimento() {
		return diaDeRecebimento;
	}

	public void setDiaDeRecebimento(int diaDeRecebimento) {
		this.diaDeRecebimento = diaDeRecebimento;
	}
}
