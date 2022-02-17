package assignments.assignment1;

public class Savings extends Account{
	
	public Savings(int id, double balance) {
		super(id, balance);
	}
	public void withdraw(double minus) {
		if(getBalance() >= minus) {
		 setBalance(getBalance() - minus);
		}
		else {
			System.out.println("balance not sufficient");
		}
	}
	
	
}