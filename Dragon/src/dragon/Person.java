package dragon;

public class Person {
	private Gender gender;
	
	public Person(Gender gender) {
		this.gender = gender;
	}
	
	public Gender getGender() {
		return this.gender;
	}
	
	public String toString() {
		return (gender == Gender.GIRL) ? "G" : "B";
	}
}
