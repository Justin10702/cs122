package classlab.week3;

public class Student extends Person{

	public String major;
	
	
	public Student(String name, int age, String city, String major) {
	super(name, age, city);
	this.major = major;
	}
	public void printName() {
		System.out.println(this.name);
	}
	
	protected void printAge() {
		System.out.println(getAge());
	}

	
	
}
