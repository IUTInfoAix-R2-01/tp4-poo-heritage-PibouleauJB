package yaip6;

import yaip4.Dog;

public class Circle implements GeometricObject {
	public double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public double getPerimeter() {
		return Math.PI * 2 * radius;
	}
	
	public static void main(String [] args) {
		Circle c1 = new Circle(2.0);
		System.out.println(c1);
		System.out.println("Area is= " + c1.getArea());
		System.out.println("Permiter is= " + c1.getPerimeter());
	}

}
