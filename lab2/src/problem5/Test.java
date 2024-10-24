package problem5;

public class Test {

	public static void main(String[] args) {
		Person john = new Employee("John", 30, "Engineer");
	    Person alice = new PhDStudent("Alice", 26, "Comp. Science");
	    Person bob = new Student("Bob", 22, "Mathematics");

	    Animal cat = new Cat("Murka", 5);
	    Animal dog = new Dog("Rex", 3);


	    
	    bob.assignPet(dog);
	    alice.assignPet(cat);
	    PersonRegistry registry = new PersonRegistry();
	    registry.addPerson(john);
	    registry.addPerson(alice);
	    registry.addPerson(bob);

	    registry.displayAllPeople();


	    registry.displayAllPeople();

	    john.retrievePetFrom(alice);
	    registry.displayAllPeople();
	    
		Person a1 = new Student("Abdussalam", 19, "IT-Engineer");
		
		a1.assignPet(dog);
		a1.ownPet(cat);
		System.out.println(a1);
	    
	}

}
