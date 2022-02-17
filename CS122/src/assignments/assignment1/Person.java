package assignments.assignment1;

public class Person {
	private String name;
	private String address;
	private String phonenumber;
	private String emailaddress;
	
	Person(String name, String address, String phonenumber, String emailaddress){
		this.name = name;
		this.address = address;
		this.phonenumber = phonenumber;
		this.emailaddress = emailaddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public String toString() {
		return "This is a Person and the name is " + getName();
	}
}
