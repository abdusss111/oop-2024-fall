package lab2Task1;

public class Cube extends Shape3D  {
	private int side;
	public Cube() {
		
	}
	
	public Cube(int side) {
		this.side = side;
	}
	
	public double volume() {
		return side * side * side;
	}

	public double surfaceArea() {
		return 6 * side * side;	
	}
	
	public int getSide() {
		return this.side;
	}
	
	public void setSide(int side) {
		this.side = side;
	}
	
	public String toString() {
		return "Cube, side: " + this.side + ", Area: " + this.surfaceArea() + ", Volume: " + this.volume();
	}

}
