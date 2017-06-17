package ua.study;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//List list = new ArrayList();
		List<Fruit> fruits=new ArrayList();
		fruits.add(new Fruit("orange", 20));
		fruits.add(new Fruit("banana", 40));
		fruits.add(new Fruit("apple", 15));
		
		System.out.println(fruits.size());
		System.out.println(fruits.isEmpty());
		fruits.add(2, new Fruit("potato", 10));
		System.out.println(fruits);

	}


	}


