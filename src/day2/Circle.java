package day2;

public class Circle {

	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		double area;
		area = (Math.PI*(this.getRadius()*this.getRadius()));
		return area;
	}
	
	public static void main(String[] args) {
		Circle circle = new Circle(5);
		System.out.println(circle.getArea());

	}


}
