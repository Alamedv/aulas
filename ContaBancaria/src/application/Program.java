package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("Enter account data:");
			System.out.print("Number: ");
			int accNumber = sc.nextInt();
			System.out.print("Holder: ");
			sc.next();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double initialBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			Account ac1 = new Account(accNumber, holder, initialBalance, withdrawLimit);

			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double withdrawAmount = sc.nextDouble();
			ac1.withDraw(withdrawAmount);

			System.out.println("New balance: " + String.format("%.2f $", ac1.getBalance()));
		} catch (DomainException e) {
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Unexpected error!");
		}

		sc.close();
	}

}
