package assignments.assignment1;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	
	public Account() {
	}
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public double getmonthlyInterestRate() {
		return annualInterestRate/12;
	}
	public void deposit(double add) {
		 balance += add;
	}
	public void withdraw(double minus) {
		if(balance >= minus) {
		 balance -= minus;
		}
		else {
			System.out.println("balance not sufficient");
		}
	}
}
