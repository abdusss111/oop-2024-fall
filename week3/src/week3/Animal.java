package week3;

public class Animal {
	private String name;
	private int age;
	
	public Animal() {
		
	}
	public Animal(int age) {
		this.age = age;
	}
	public Animal(String name) {
		this.name = name;
	}
	public Animal(String name, int age) {
		this(name);
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String voice() {
		return "";
	}
	
	public String toString() {
		return "name: " + this.name + ", age: " + this.age;
	}
	
	
	
}
