package entities2;

public class Account2 {

	private String holder;
	private int number;
	private double balance;
	
	
	public Account2(String holder, int number) {
		this.holder = holder;
		this.number = number;
	}

	public Account2(String holder, int number, double balance) {

		this.holder = holder;
		this.number = number;
		this.balance = balance;

				
}

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
			balance -= amount + 5;
		}

		public String toString () {
			return "Account holder: " + holder + ". Account number: " + number + ". Balance $: " + String.format("%.2f", balance);
		
	}

}