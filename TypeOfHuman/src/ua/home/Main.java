package ua.home;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Human human1 = new Human("Bob","hunter",28);
		Human human2 = new Human("Greg","vegan", 31);
		Dish dish1 = new Dish("ceasar", "vegan");
		Dish dish2 = new Dish("broccoli", "vegan");
		Dish dish3 = new Dish("pork", "hunter");
		Dish dish4 = new Dish("beef", "hunter");
		Dish [] dishs = {dish1,dish2,dish3,dish4};
		Menu menu = new Menu(dishs);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 if you're Bob");
		System.out.println("Enter 2 if you're Greg");
		String user = "";
		user = scanner.next();
		switch (user){
		case "1":{
			for (int i = 0; i < dishs.length; i++) {
				if(human1.getType()==dishs[i].getType()){
					System.out.println("You can eat: "+dishs[i].getName());
				}
			}
			break;
		}
		case "2":{
			for (int i = 0; i < dishs.length; i++) {
				if(human2.getType()==dishs[i].getType()){
					System.out.println("You can eat: "+dishs[i].getName());
				}
			}
			break;
		}
		default:{
			System.out.println("Incorrect input");
			break;
		}
		}
	}
}
