package controller;

import model.Banco;
import model.ContaEspecial;
import model.ContaPoupanca;

public class ContaBancaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Banco conta1 = new Banco("Alamedv", 5522, 21282025, 0);
		Banco conta2 = new Banco("Soho", 5544, 21282026, 200);
		Banco conta3 = new ContaPoupanca("Tarantino", 2223, 21282020, 1000, 15);
		Banco conta4 = new ContaEspecial("Almeidv", 1234, 21282121, 50000, 200000.0);

		System.out.println(conta1);
		System.out.println(conta2);
		System.out.println(conta3);
		System.out.println(conta4);
		
		System.out.println(conta1.depositar(200));
		
		System.out.println(conta1.calcNovoSaldo(5));
		System.out.println(conta4.calcNovoSaldo(5));

	}

}
