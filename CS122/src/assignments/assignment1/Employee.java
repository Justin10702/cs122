package assignments.assignment1;

public class Employee extends Person{
	private String office;
	private String salary;
	private String datehired;
	
	public Employee(String office, String salary, String datehired, String name, String address, String phonenumber, String emailaddress){
		super(name, address, phonenumber, emailaddress);
		this.office = office;
		this.salary = salary;
		this.datehired = datehired;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getDatehired() {
		return datehired;
	}

	public void setDatehired(String datehired) {
		this.datehired = datehired;
	}
	public String toString() {
		return "This is an Employee" + " and the name is " + getName();
		
	}
}
