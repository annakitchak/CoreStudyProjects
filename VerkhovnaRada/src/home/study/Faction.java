package home.study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import home.study.Deputy;
import home.study.Main;


public class Faction {
	
	private String name;
	private List<Deputy> deputies=new ArrayList();
	public Faction(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public List<Deputy> getDeputies() {
		return deputies;
	}
	public void setDeputies(List<Deputy> deputies) {
		this.deputies = deputies;
	}
	public void addDeputyIntoFaction(){
		boolean temp = false;
		boolean t=false;
	
			int userWeight = 0;
			int userHeight = 0;
			//do{
			System.out.println("Enter deputy weight.");
			if(Main.scanner.hasNextInt()){
				userWeight = Main.scanner.nextInt();
				t=true;
			}else{
				System.out.println("Wrong input! Try again.");
				t=false;
			}//}while(t!=true);

			System.out.println("Enter deputy height.");
			if(Main.scanner.hasNextInt()){
				userHeight = Main.scanner.nextInt();
				t=true;
			}else{
			System.out.println("Wrong input! Try again.");
			}
		System.out.println("Enter depyty First Name.");
		String userFirstName = Main.scanner.next();
		System.out.println("Enter depyty Last Name.");
		String userLastName = Main.scanner.next();
		System.out.println("Enter depyty age.");
		int userAge = Main.scanner.nextInt();
		System.out.println("Does deputy is briber? Enter true or false");
		String isBriber = Main.scanner.next();
		boolean briber;

        if (isBriber.equalsIgnoreCase("true")) {
            briber = true;

        } else {
            briber = false;

        }
        Deputy deputy = new Deputy(userWeight, userHeight, userFirstName, userLastName, userAge, briber);
        deputy.giveBribe();
        deputies.add(deputy);
		}
		
	
	
	public void removeDeputyFromFaction(){
		System.out.println("Enter deputy First Name for remove him from faction.");
		String firstName = Main.scanner.next();
		System.out.println("Enter deputy Last Name for remove him from faction");
		String lastName = Main.scanner.next();
		Iterator<Deputy>iterator = deputies.iterator();
		boolean deleted = false;
		while(iterator.hasNext()){
			Deputy deputy = iterator.next();
            if (deputy.getFirstName().equalsIgnoreCase(firstName)
                    && deputy.getLastName().equalsIgnoreCase(lastName)) {
                iterator.remove();
                deleted = true;
            }
		}
		if (!deleted) {
            System.out.println("Does'n exist deputy for remove");
        }
	}
	
	public void showAllGraftersFromFaction(){
		 boolean existBriber = false;
		 if (deputies.isEmpty()) {
			 System.out.println("Doesn't exist any deputies");
		 } else {
			 for (Deputy deputy : deputies) {
				 if(deputy.isGrafter()){
					 System.out.println(deputy.getFirstName()+" "+deputy.getLastName()+" is a grafter!");
					 existBriber = true;
				 }
			}
			 if (!existBriber) {
				 System.out.println("Don't have briber in fraction");
	        }
		}
	}
	
	public void printBiggestGrafter(){
		System.out.println("Enter faction name!");
		int brSize =0;
		String fName="";
		String lName = "";
		String factionName = Main.scanner.next();
		if(factionName.equalsIgnoreCase(name)){
			for (Deputy deputy : deputies) {
				if(deputy.getBribeSize()>brSize){
					brSize=deputy.getBribeSize();
					fName=deputy.getFirstName();
					lName=deputy.getLastName();
				}
			}
			System.out.println("Biggest grafter is "+fName+" "+lName);
		}
	}
	
	@Override
	public String toString() {
		return "Faction [name=" + name + ", deputies=" + deputies + "]";
	}
	


	
	
}
