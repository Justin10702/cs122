package assignments.assignment1;

public class Student extends Person{


	final private String CLASSSTATUS;
	
	public Student(String CLASSSTATUS, String name, String address, String phonenumber, String emailaddress) {
		super(name, address, phonenumber, emailaddress);
		this.CLASSSTATUS = CLASSSTATUS;
	}

	public String getCLASSSTATUS() {
		return CLASSSTATUS;
	}
	public String toString() {
		return "This is a Student and the name is " + getName();
	}
}
