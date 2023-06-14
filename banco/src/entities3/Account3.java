package entities3;

public class Account3 {

	public Account3(String holder, int number, double balance) {
		super();
		this.holder = holder;
		this.number = number;
		this.balance = balance;
	}

	public Account3(String holder, int number) {
		super();
		this.holder = holder;
		this.number = number;
	}

	private String holder;
	private int number;
	private double balance;

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

		public double getBalance() {
		return balance;
	}

		public void deposit (double amount) {
			balance = balance + amount;
		}
	
		public void withdraw (double amount) {
			balance = balance - amount + 5;
		}
		
		public String toString () {
			return "account holder: " + holder + ". Account number" + number + ". Balance $: " + String.format("%2f.%", balance);
		}
		
		
}
