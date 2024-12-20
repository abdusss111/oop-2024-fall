package problem5;

public abstract class Person {
    private String name;
    private int age;
    private Animal pet;
    private Animal assignedPet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void assignPet(Animal pet) {
    	if (!this.hasAssignedPet()) {
            this.assignedPet = pet;
    	}
    	else System.out.println("this person already have assigned pet");
    }
    
    public void ownPet(Animal pet) {
    	if (!this.hasPet()) {
            this.pet = pet;
    	}
    	else System.out.println("this person already have a pet");
    }

    public void removePet() {
        this.pet = null;
    }

    public boolean hasPet() {
        return pet != null;
    }
    
    public boolean hasAssignedPet() {
        return pet != null;
    }

    public Animal getPet() {
        return pet;
    }

    public abstract String getOccupation();

    @Override
    public String toString() {
        return name + ", " + age + " years old, Occupation: " + getOccupation() +
               ((hasPet() ? ", Pet: " + pet.getName() + " (" + pet.getSound() + ")." : 
            	", No own Pet. ") + (this.assignedPet == null ? "no assigned pet" : " assigned pet is: " + this.assignedPet));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        return name.equals(other.name) && age == other.age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    public void leavePetWith(Person caretaker, Animal pet) {
    	if(caretaker instanceof PhDStudent &&  pet instanceof Dog) {
            System.out.println("phd student cant take dogs");
    	}
    	else if (!hasPet()) {
            System.out.println(name + " has no pet to leave.");
            return;
        }
        caretaker.assignPet(pet);
        removePet();
        System.out.println(name + " left their pet with " + caretaker.name);
    }

    public void retrievePetFrom(Person caretaker) {
        if (!caretaker.hasPet()) {
            System.out.println(caretaker.name + " has no pet to return.");
            return;
        }
        this.assignPet(caretaker.getPet());
        caretaker.removePet();
        System.out.println(name + " retrieved their pet from " + caretaker.name);
    }
}

