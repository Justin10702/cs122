package assignments.assignment1;

public class Faculty extends Employee {
	private String officehours;
	private String rank;
	
	public Faculty(String officehours, String rank, String office, String salary, String datehired, String name, String address, String phonenumber, String emailaddress) {
		super(office, salary, datehired, name, address, phonenumber, emailaddress);
		this.officehours = officehours;
		this.rank = rank;
	}

	public String getOfficehours() {
		return officehours;
	}

	public void setOfficehours(String officehours) {
		this.officehours = officehours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	public String toString() {
		return "This is a Faculty and the name is " + getName();
	}
}
