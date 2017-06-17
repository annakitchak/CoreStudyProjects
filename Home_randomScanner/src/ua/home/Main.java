package ua.home;

import java.util.Scanner;

public class Main {

	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String user = "";
		System.out.println("Enter some...");
		user = scanner.next();
		scanner.close();
		
		
		System.out.println(user.replaceAll("[A-Za-z]", ""));
		
	}

}
