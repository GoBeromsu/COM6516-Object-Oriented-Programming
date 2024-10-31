package code5;

import sheffield.EasyReader;
import java.util.*;

public class HashSetTest {
	public static void main(String[] args) {

		// Declare people as a HashSet
		Set<Person> people = new HashSet<Person>();

		// Initialize EasyReader to read from person.txt
		EasyReader file = new EasyReader("person.txt");
		String firstname, surname, line;
		int age;

		// Read number of records
		int numData = file.readInt();

		// Read each line, split into tokens and create Person objects
		for (int i = 0; i < numData; i++) {
			line = file.readString();
			String[] tokens = line.split("\\|");
			firstname = tokens[0];
			surname = tokens[1];
			age = Integer.parseInt(tokens[2]);
			people.add(new Person(firstname, surname, age));
		}

		// Part a: Display people with surname "James" or "Cole"
		System.out.println("** People with surname 'James' or 'Cole':");
		Iterator<Person> iterator = people.iterator();
		while (iterator.hasNext()) {
			Person person = iterator.next();
			if (person.getSurname().equals("James") || person.getSurname().equals("Cole")) {
				System.out.println(person);
			}
		}

		// Part b: Remove people with surname "Wright-Phillips"
		iterator = people.iterator();
		while (iterator.hasNext()) {
			Person person = iterator.next();
			if (person.getSurname().equals("Wright-Phillips")) {
				iterator.remove();
			}
		}

		System.out.println("** People list after removing surname 'Wright-Phillips':");
		for (Person person : people) {
			System.out.println(person);
		}

		// Part c and Part d implementations can go here based on TreeSet usage and AgeComparator
	}
}
