package assignments.assingment3;

public class Cylinder extends Shape{

	private double radius2;
	private double height;
	
	public Cylinder(double r2, double h) {
		super("Cylinder");
		radius2 = r2;
		height = h;
	}

	@Override
	public double area() {
		return Math.PI*radius2*radius2*height;
	}
	
	public String toString() {
		
		return super.toString() + " of radius " + radius2 + "and height " + height;
	}
	
}
