package assignments.assingment3;

public abstract class Shape {
	public String shapeName;
	
	public abstract double area(); 
	
	public Shape(String name) {
		shapeName = name;
	}
	
	public String toString() {
		return "The shape is a" + shapeName;
	}
}
