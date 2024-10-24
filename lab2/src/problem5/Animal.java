package problem5;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public abstract String getSound();

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
    	return "name: " + name + ", age: " + age;
    }
}

