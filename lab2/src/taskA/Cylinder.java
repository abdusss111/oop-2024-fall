package taskA;

public class Cylinder extends Shape3D {
	private double height, radius;
	
	public Cylinder() {
		
	}
	
	public Cylinder(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}
	
	public double volume() {
		return Math.PI * height * radius * radius;
	}
	
	public double surfaceArea() {
		return 2 * Math.PI * radius * (height + radius);
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String toString() {
		return "Cylinder, radius: " + this.radius + ", height: " + this.height + ", Area: " + this.surfaceArea() + ", Volume: " + this.volume();
	}
	

}
