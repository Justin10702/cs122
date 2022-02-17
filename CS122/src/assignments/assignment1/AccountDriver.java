package assignments.assignment1;

public class AccountDriver {

	public static void main(String[] args) {

		Account c = new Checking(1234, 2224.3, -200);
		Account s = new Savings(4444, 100032.7);
		Account a = new Account(1111, 349594.2);
		
		System.out.println(" The account id is: " + c.getId() + "\n The account balance is:" + c.getBalance());
		System.out.println("\n ------------------------ \n" + " The account id is: " + s.getId() + "\n The account balance is:" + s.getBalance());
		System.out.println("\n ------------------------ \n" + " The account id is: " + a.getId() + "\n The account balance is:" + a.getBalance());
		
		
	}
		
	}


