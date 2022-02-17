package assignments.assignment1;

public class UniversityDriver {

	public static void main(String[] args) {
		
		Person p = new Person("Jim Carrey", "123 Backwards Lane", "123-456-7890", "mylittlepony28@gmail.com");
		Person student =new Student( "Sophomore", "Napoleon Dynamite", "15 Paris Drive", "424-679-4246", "francelover15@gmail.com");
		Person e = new Employee( "145W", "$63,217", "03/24/2005", "Michael Scott", "87 Scranton Street", "555-555-5555", "jimsmellsfunny@hotmail.com");
		Person f = new Faculty("TR 4-6:30 PM","Professor", "897E", "$32,496", "11/11/99", "Brad Pitt", "56 Fight Court", "756-435-0965", "betterthanleodecaprio@yahoo.com");
		Person staff = new Staff("Professor", "558W","$115,345", "08/06/2021", "Idris Elba", "233 Brighton Lane", "998-345-3455","ilovejohncena@aol.com");
		
		System.out.println(p.toString() + "\n" + student.toString() + "\n" + e.toString() + "\n" + f.toString() + "\n" + staff.toString() + "\n");

	}

}
