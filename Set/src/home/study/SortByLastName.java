package home.study;

import java.util.Comparator;

public class SortByLastName implements Comparator<Person>{

	@Override
	public int compare(Person arg0, Person arg1) {
		return arg0.getLastName().compareTo(arg1.getLastName());
		
	}
	
}
