package ua.study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
////		Map<Integer, String> map = new HashMap<>();
////		map.put(10, "ten");
////		map.put(20, "twenty");
////		map.put(30, "thirty");
////		map.put(40, "fourty");
////		map.put(50, "fifty");
////		System.out.println(map);
////		for (Integer i :map.keySet()) {
////			if(i==50){
////				System.out.println("exist");
////			}
////		}
//		
////		for (Integer i :map.keySet()) {
////			System.out.println(i+" "+map.get(i));
////		}
//		
////		Set <Entry<Integer, String>> set = map.entrySet();
////		for(Entry<Integer, String> en : set){
////			System.out.println(en);
////		}
//		
//		Map<Person,Auto> map = new HashMap<Person,Auto>();
//		map.put(new Person("igor", 20), new Auto("mazda", 2));
//		map.put(new Person("ira", 31), new Auto("bmw", 3));
//		map.put(new Person("roma", 40), new Auto("lada", 10));
////		int tempYears =0;
////		String tempBrand="";
////		String tempName="";
////		for (Person p : map.keySet()) {
////			if(map.get(p).getYears()>tempYears){
////				tempYears=map.get(p).getYears();
////				tempBrand=map.get(p).getBrand();
////				
////			}
////		}
////		System.out.println(tempBrand);
//		
//		
//		int age=0;
//		String nameAuto="";
//		for(Auto auto:map.values()){
//			if(age<auto.getYears()){
//				age=auto.getYears();
//				nameAuto=auto.getBrand();
//			}
//		}
//		System.out.println(nameAuto+" "+age);
		
//Вивести імя людини в якої більша сумарна кількісь років автомобілів 		
		List<Auto> list1 = new ArrayList<>();
		list1.add(new Auto("lada", 10));
		list1.add(new Auto("mers", 3));
		
		List<Auto> list2 = new ArrayList<>();
		list1.add(new Auto("mazda", 5));
		list1.add(new Auto("smart", 2));
		
		Map<Person,List<Auto>> map = new HashMap<>();
		map.put(new Person("vova", 20), list1);
		map.put(new Person("roza", 23), list2);
		
		
		Set <Entry<Person, List<Auto>>> set = map.entrySet();
		int maxYears=0;
		int currentYears=0;
		String personName="";
		for(Entry<Person, List<Auto>> entry : set){
			for(Auto auto: entry.getValue()){
				currentYears = currentYears+auto.getYears();
			}
			if(currentYears>maxYears){
				maxYears=currentYears;
				personName=entry.getKey().getName();
			}
			currentYears=0;
		}
		System.out.println(personName+" "+maxYears);
		
	}

}
