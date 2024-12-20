package problem5;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return "Woof";
    }
    
    public String toString() {
    	return "Dog, " + super.toString();
    }
}
