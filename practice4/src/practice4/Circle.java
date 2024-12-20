package practice4;

public class Circle extends Shape {
	int pos;
	int radius;
	Color color;
	public Circle() {
		
	}
	public Circle(int pos, Color color) {
		super(pos, color);
	}
	public void draw() {
		if (this.color == Color.BLACK) {
			System.out.print("()");
		}
		else System.err.print("()");
	}
	public double calcSpace(int radius) {
		return Math.PI * radius * radius;
	}
}
