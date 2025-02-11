package yaip6;

public class Rectangle implements GeometricObject {
	public double width;
	public double length;
	
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}

	public double getArea() {
		return width * length;
	}
	public double getPerimeter() {
		return width * 2 + length * 2;
	}
	
	public static void main(String [] args) {
		Rectangle r1 = new Rectangle(2.0, 4.0);
		System.out.println(r1);
		System.out.println("Area is= " + r1.getArea());
		System.out.println("Permiter is= " + r1.getPerimeter());
	}
}
