package week3Task2;

import java.util.Vector;

public class Test {
	public static void main(String[] args) {
		Person person = new Person("person", "tb59");
		Staff worker = new Staff("worker", "tb60", "school", 10);
		Student student = new Student("worker", "tb61", "IS", 1, 10000.0);
		
		Vector<Person> persons = new Vector<>();
		
		persons.add(person);
		persons.add(worker);
		persons.add(student);
		
		for(Person p : persons) {
            System.out.println(p);
		}
	}

}
