package taskA;

public class Sphere extends Shape3D {
	private double radius;
	
	public Sphere(double radius) {
		this.radius = radius;
	}
	
	public double volume() {
		return 4/3 * Math.PI * radius * radius * radius ;
	}
	
	public double surfaceArea() {
		return 4 * Math.PI * radius * radius ;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	} 
	
	public String toString() {
		return "Sphere, radius: " + this.radius + ", Area: " + this.surfaceArea() + ", Volume: " + this.volume();
	}
}
