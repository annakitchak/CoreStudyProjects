package ua.study;

import java.util.Comparator;

public class SortByPrice implements Comparator<Pie>{

	@Override
	public int compare(Pie o1, Pie o2) {
		
		return o1.getPrice()-o2.getPrice();
	}

}
