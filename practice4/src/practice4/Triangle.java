package practice4;

public class Triangle extends Shape {
	int pos;
	int a;
	int b;
	int c;
	Color color;
	public Triangle() {
		
	}
	public Triangle(int pos, Color color) {
		super(pos, color);
	}
	public void draw() {
		if (this.color == Color.BLACK) {
			System.out.print("/\"");
		}
		else System.err.print("/\"");
	}
	public double calcSpace() {
		double p = (a + b + c)/2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
