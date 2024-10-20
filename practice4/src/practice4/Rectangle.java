package practice4;

public class Rectangle extends Shape {
	int pos;
	int a;
	int b;
	int c;
	Color color;
	public Rectangle() {
		
	}
	public Rectangle(int pos, Color color) {
		super(pos, color);
	}
	public void draw() {
		if (this.color == Color.BLACK) {
			System.out.print("| |");
		}
		else System.err.print("| |");
	}
	public int calcSpace() {
		return a * b;
	}
}
