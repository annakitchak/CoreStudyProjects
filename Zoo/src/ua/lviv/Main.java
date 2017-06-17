package ua.lviv;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String zoo [] = {null, null, "cat", "dog", "bird", null, null, "snake", null, null, "spider", null, null, null, "elephant", null};
		System.out.println("Enter 1 to check is there an animal in a zoo.");
		System.out.println("Enter 2 to add a new animal.");
		System.out.println("Enter 3 to remove animal from zoo.");
		System.out.println("Enter 4 to show all animals.");
		System.out.println("Enter 5 to exit.");
		String user = "";
		do{
			user = scanner.next();
			switch (user){
				case "1":{
					System.out.println("Enter an animal.");
					user = scanner.next();
					boolean s = false;
					for (int i = 0; i < zoo.length; i++) {
						if(user.equals(zoo[i])){
							s=true;
							System.out.println("Your animal is in the zoo.");
						}
					}
					if(s==false){
						System.out.println("This animal doesn't exist in a zoo.");
					}
				break;
				}
				case "2":{
					System.out.println("Enter an animal.");
					boolean ent = false;
					do{
					user = scanner.next();
					boolean s = false;
					
					if(zoo[zoo.length-1]!=null){
						System.out.println("No free space in a zoo.");
					}else{
					
					for (int i = 0; i < zoo.length; i++) {
						if(user.equals(zoo[i])){
							s=true;
							System.out.println("Your animal is in the zoo.");
						}
					}
																
					if(s==false){
						for (int i = 0; i < zoo.length; i++) {
							//int lenght = zoo.length-1;
							
							if(zoo[i]==null){
								zoo[i]=user;
								ent = true;
								System.out.println("Your animal added.");
								break;
							}
						}
					}
					}		
					}while(ent!=true);
					break;
				}
				case "3":{
					System.out.println("Which animal you want to remove?");
					boolean bb = false;
					do{
					user = scanner.next();
					boolean s = false;
					for (int i = 0; i < zoo.length; i++) {
						if(user.equals(zoo[i])){
							s=true;
							zoo[i]=null;
							bb = true;
							System.out.println("Your animal is removed.");
						}
					}
					if(s==false){
						System.out.println("This animal doesn't exist in a zoo.");
					}
					}while(bb!=true);
				break;
				}
				case "4":{
					System.out.println("These are the animals in the zoo:");
					for (int i = 0; i < zoo.length; i++) {
						if(zoo[i]!=null){
							System.out.println(zoo[i]);
						}
					}
				break;
				}
				case "5":{
				System.exit(0);
				break;
				}
				default:{
				break;
				}
			}
		}while(!user.equals("5"));
				
	}

}
