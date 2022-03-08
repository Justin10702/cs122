package classSamples.polymorphism.Firm;//********************************************************************
//  Firm.java       Author: Lewis/Loftus
//
//  Demonstrates polymorphism via inheritance.
//********************************************************************

public class Firm {
	// -----------------------------------------------------------------
	// Creates a staff of employees for a firm and pays them.
	// -----------------------------------------------------------------
	public static void main(String[] args) {
		Executive t1 = new Executive("Sam", "123 Main Line", "555-0469", "123-45-6789", 2423.07);
		Employee t2 =  new Employee("Carla", "456 Off Line", "555-0101", "987-65-4321", 1246.15);
		Hourly t3 = new Hourly("Diane", "678 Fifth Ave.", "555-0690", "958-47-3625", 10.55);
		Volunteer t4 = new Volunteer("Norm", "987 Suds Blvd.", "555-8374");
		
		System.out.println(t1 + "\n");
		System.out.println(t2 + "\n");
		System.out.println(t3 + "\n");
		System.out.println(t4 + "\n");
	}
}
