package home.study;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<Person>persons=new TreeSet(new SortByLastName());
		persons.add(new Person("Kate", "Hudson", 33));
		persons.add(new Person("Jessica", "Simpson", 36));
		persons.add(new Person("Sandra", "Bullok", 39));
		persons.add(new Person("Jennifer", "Aniston", 42));
		persons.add(new Person("Jennifer", "Lopez", 46));
		for (Person person : persons) {
			System.out.println(person);
		}
		

	}

}
