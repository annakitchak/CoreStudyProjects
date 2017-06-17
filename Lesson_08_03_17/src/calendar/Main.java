package calendar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String user = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 to check month");
		System.out.println("Enter 2 to display months with the same season");
		System.out.println("Enter 3 to display months with the same number of days");
		System.out.println("Enter 4 to display months with fewer number of days");
		System.out.println("Enter 5 to display months with more number of days");
		System.out.println("Enter 6 to display next season");
		System.out.println("Enter 7 to display previous season");
		System.out.println("Enter 8 to display months with an even number of days");
		System.out.println("Enter 9 to display months with an odd number of days");
		System.out.println("Enter 10 to display month with even number of days");
		System.out.println("Enter 11 to exit");
		do{
		boolean exist = false;
		user = scanner.next();
		switch(user){
		case "1":{
			do{
			System.out.println("Enter month!");
			user = scanner.next();
			Month [] months = Month.values();
			for (int i = 0; i < months.length; i++) {
				if(user.toUpperCase().equals(months[i].name())){
					System.out.println(months[i].name()+" have "+months[i].getDays()+" days");
					exist = true;
					break;
				}
				}
			if(exist==false){
				System.out.println("This month doesn't exist! Try again.");
			}}while(!exist==true);
		break;	
		}
		case "2":{
			System.out.println("Enter month!");
			user = scanner.next();
			Month [] months = Month.values();
			Season season;
			for (int i = 0; i < months.length; i++) {
				if(user.toUpperCase().equals(months[i].name())){
					season = months[i].getSeason();
					exist = true;
					for (int j = 0; j < months.length; j++) {
						if(season.equals(months[j].getSeason())){
							
							System.out.println(months[j]+ " - "+months[j].getSeason());
						}
					}
				}
			}
			if(exist==false){
				System.out.println("This month doesn't exist! Try again.");
			}
		break;	
		}
		case "3":{
			System.out.println("Enter month!");
			user = scanner.next();
			Month [] months = Month.values();
			int days=0;
			for (int i = 0; i < months.length; i++) {
				if(user.toUpperCase().equals(months[i].name())){
					days=months[i].getDays();
					exist = true;
					for (int j = 0; j < months.length; j++) {
						if(days==months[j].getDays()){
							System.out.println(months[j].name());
						}
					}	
				}
			}
			if(exist==false){
				System.out.println("This month doesn't exist! Try again.");
			}
		break;	
		}
		case "4":{
			System.out.println("Enter month!");
			user = scanner.next();
			Month [] months = Month.values();
			int days=0;
			for (int i = 0; i < months.length; i++) {
				if(user.toUpperCase().equals(months[i].name())){
					days=months[i].getDays();
					
					for (int j = 0; j < months.length; j++) {
						if(days>months[j].getDays()){
							System.out.println(months[j].name());
							exist=true;
						}
					}
					if(exist==false){
						System.out.println("No less days");
					}
					exist=true;
				}
			}
			if(exist==false){
				System.out.println("This month doesn't exist! Try again.");}
			
		break;	
		}
		case "5":{
			System.out.println("Enter month!");
			user = scanner.next();
			Month [] months = Month.values();
			int days=0;
			for (int i = 0; i < months.length; i++) {
				if(user.toUpperCase().equals(months[i].name())){
					days=months[i].getDays();
					
					for (int j = 0; j < months.length; j++) {
						if(days<months[j].getDays()){
							System.out.println(months[j].name());
							exist=true;
						}
					}
					if(exist==false){
						System.out.println("No more days");
					}
					exist=true;
				}
			}
			if(exist==false){
				System.out.println("This month doesn't exist! Try again.");}
		break;	
		}
		case "6":{
			System.out.println("Enter month!");
			user = scanner.next();
			Month [] months = Month.values();
			Season season;
			for (int i = 0; i < months.length; i++) {
				if(user.toUpperCase().equals(months[i].name())){
					season=months[i].getSeason();
					if(season.equals(Season.WINTER)){
						System.out.println("Next season is "+season.SPRING.name());
					}else if(season.equals(Season.SPRING)){
						System.out.println("Next season is "+season.SUMMER.name());
					}else if(season.equals(Season.SUMMER)){
						System.out.println("Next season is "+season.AUTUMN.name());
					}else if(season.equals(Season.AUTUMN)){
						System.out.println("Next season is "+season.WINTER.name());
					}
					
					exist=true;
				}
			}
			if(exist==false){
				System.out.println("This month doesn't exist! Try again.");}
		break;	
		}
		case "7":{
			System.out.println("Enter month!");
			user = scanner.next();
			Month [] months = Month.values();
			Season season;
			for (int i = 0; i < months.length; i++) {
				if(user.toUpperCase().equals(months[i].name())){
					season=months[i].getSeason();
					if(season.equals(Season.WINTER)){
						System.out.println("Previous season is "+season.AUTUMN.name());
					}else if(season.equals(Season.SPRING)){
						System.out.println("Previous season is "+season.WINTER.name());
					}else if(season.equals(Season.SUMMER)){
						System.out.println("Previous season is "+season.SPRING.name());
					}else if(season.equals(Season.AUTUMN)){
						System.out.println("Previous season is "+season.SUMMER.name());
					}
					
					exist=true;
				}
			}
			if(exist==false){
				System.out.println("This month doesn't exist! Try again.");}
		break;	
		}
		case "8":{
			Month [] months = Month.values();
			for (int i = 0; i < months.length; i++) {
				if((months[i].getDays())%2 == 0){
				System.out.println(months[i].name());
				}
			}
		break;	
		}
		case "9":{
			Month [] months = Month.values();
			for (int i = 0; i < months.length; i++) {
				if((months[i].getDays())%2 == 1){
				System.out.println(months[i].name());
				}
			}
		break;	
		}
		case "10":{
			System.out.println("Enter month!");
			user = scanner.next();
			Month [] months = Month.values();
			int days=0;
			for (int i = 0; i < months.length; i++) {
				if(user.toUpperCase().equals(months[i].name())){
					days=months[i].getDays();
					if(days%2==0){
						System.out.println("Yes");
						exist=true;
					}
					if(exist==false){
						System.out.println("No");}
					exist=true;
				}
			}
			if(exist==false){
				System.out.println("This month doesn't exist! Try again.");}
		break;	
		}
		case "11":{
			System.exit(0);
			break;	
			}
		default:{
			System.out.println("Wrong input! Try again.");
		break;	
		}
		}
		
	}while(!user.equals("11"));
		scanner.close();
}
}
