package week3;

public class AnimalHorseTest {
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		Horse horse = new Horse("Aigyr", 5);
		Horse horse2 = new Horse("Aigyr2", 7, 170.0, "black");
		System.out.println(animal);
		System.out.println(horse);
		System.out.println(horse2);
		
		System.out.println(animal.voice());
		System.out.println(horse2.voice());
		System.out.println(horse2.voice(3));
	}
	
	
}
