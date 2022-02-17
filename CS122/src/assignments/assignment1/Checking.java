package assignments.assignment1;

public class Checking extends Account{
	
	private int overdraft = -100;
	
	public Checking(int id, double balance, int overdraft) {
		super(id, balance);
		this.overdraft = overdraft;
	}
	
	public void withdraw(double minus) {
		if(getBalance() - minus >= overdraft) {
		 setBalance(getBalance() - minus);
		}
		else {
			System.out.println("balance not sufficient");
		}
	}

	public int getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(int overdraft) {
		this.overdraft = overdraft;
	}

}
