package application2;

import java.util.Locale;
import java.util.Scanner;

import entities2.Account2;

public class Program2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account2 account;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println();

		System.out.println("Is there a deposit value? (y/n)");
		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.println("Informe o valor do deposito: ");
			double initialDeposit = sc.nextDouble();
			account = new Account2(holder, number, initialDeposit);

		} else {
			System.out.println();
			account = new Account2(holder, number);
		}

		System.out.println("holder: " + holder);
		System.out.println("Account number: " + number);
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble ();
		account.deposit(depositValue);
		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a withdraw value");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		
		sc.close();
	}

}
