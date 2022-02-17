package assignments.assignment1;

public class Staff extends Employee {
	private String title;
	
	public Staff(String title, String office, String salary, String datehired, String name, String address, String phonenumber, String emailaddress ) {
		super(office, salary, datehired,name, address, phonenumber, emailaddress);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String toString() {
		return "This is a Staff" + " and the name is " + getName();
	}
}
