package ua.study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		List<Person> persons =new ArrayList<>();
		persons.add(new Person("max", 22));
		persons.add(new Person("dima", 26));
		persons.add(new Person("mary", 21));
		persons.add(new Person("julia", 29));
		
		ListIterator<Person> listIterator = persons.listIterator(persons.size());
		while(listIterator.hasPrevious()){
		if(listIterator.previous().getName().equals("dima")){
			listIterator.add(new Person("justin", 23));
		}
		
//		Iterator<Person> iterator = persons.iterator();
//		while(iterator.hasNext()){
//			Person removePerson = iterator.next();
//			if(removePerson.getName().equals("dima")&&removePerson.getAge()==26){
//				iterator.remove();
//			}
//		}
	}

}
}
