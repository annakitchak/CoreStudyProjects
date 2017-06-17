package ua.study;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
//		Set<Integer> set = new HashSet<Integer>();
//		set.add(12);
//		set.add(1);
//		set.add(10);
//		set.add(9);
//		set.add(15);
//		set.add(11);
//		set.add(1000);
//		
//		for (Integer i : set) {
//			System.out.println(i);
//		}
		
//		Set<Pie>pies=new HashSet<>();
//		pies.add(new Pie("napoleon", 160));
//		pies.add(new Pie("gold key", 120));
//		pies.add(new Pie("sharlotka", 110));
//		pies.add(new Pie("spartak", 170));
//		pies.add(new Pie("spartak", 170));
//		
////		Iterator<Pie>iterator=pies.iterator();
////		int max=0;
////		String name = "";
////		while(iterator.hasNext()){
////			Pie pie =iterator.next();
////			if(pie.getPrice()>0){
////				max=pie.getPrice();
////				name=pie.getName();
////			}
////		}
////		System.out.println(name);
//		
//		for (Pie pie : pies) {
//			System.out.println(pie);
//		}
		
		
	//	Set<Pie>pies=new TreeSet<>(new SortByName().thenComparing(new SortByPrice()));
		Set<Pie>pies=new TreeSet<>(((Comparator<Pie>) new SortByName()).thenComparing(new SortByPrice()));
		pies.add(new Pie("napoleon", 160));
		pies.add(new Pie("napoleon", 180));
		pies.add(new Pie("gold key", 120));
		pies.add(new Pie("sharlotka", 110));
		pies.add(new Pie("spartak", 170));
		
		for (Pie pie : pies) {
			System.out.println(pie);
		}
		
		
}
}
