package classlab.week2;

public class square extends Shape{
	
	public int side;
	public int area;
	
	public square(String name, int side) {
		super(name);
		this.side = side;
	}
	public int area() {
		return side*side;
	}
	
	public String toString() {
		return "The name of the shape is a " + name + "the area is " + area();

		
	}
}
