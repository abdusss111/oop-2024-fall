package week3;

public class Horse extends Animal {
	private double height;
	private String color;
	
	public Horse() {
		
	}
	public Horse(String name, int age) {
		super(name, age);
	}
	public Horse(String name, int age, double height, String color) {
		super(name, age);
		this.height = height;
		this.color = color;	
	}
	
	public String voice(int count) {
		String result = "igogo";
		for(int i = 0; i < count; i++) {
			result += "go";
		}
		return result;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String toString() {
		return super.toString() + ", color: " + this.color + ", height: " + this.height ;
	}
}
