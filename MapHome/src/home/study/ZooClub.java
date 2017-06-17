package home.study;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ZooClub {
	private static ZooClub zooClub;
	public static ZooClub getInstance(){
        if(zooClub == null){
        	zooClub = new ZooClub();
        }
        return zooClub;
    }
	Map<Person,List<Animal>> map = new HashMap<>();	
	
	Scanner scanner = new Scanner(System.in);
	Set <Entry<Person, List<Animal>>> set = map.entrySet();
	
	public void addClubMember(){
		System.out.println("Enter member's name.");
		String name = scanner.next();
		boolean s = false;
		System.out.println("Enter member's age.");
		int age=scanner.nextInt();
		map.put(new Person(name, age), new ArrayList<Animal>());
//		Person person = new Person(name, age);
		
//		List<Animal> list = new ArrayList();
// 		map.put(person, list);
	}
	public void addAnimalToMember(){
		System.out.println("Enter member's name.");
		String name = scanner.next();
		boolean added = false;
		for (Entry<Person, List<Animal>> en : set) {
			if(en.getKey().getName().equalsIgnoreCase(name)){
				System.out.println("Enter type of animal");
				String typeOfAnimal = scanner.next();
				System.out.println("Enter animal's name");
				String animalName = scanner.next();
				en.getValue().add(new Animal(typeOfAnimal, animalName));
				added=true;
			}
		}
		if(!added){
			System.out.println("This member not exist!");
		}
	}
	
	public void removeAnimalFromMember(){
		System.out.println("Enter member's name.");
		String name = scanner.next();
		boolean deleted = false;
		for (Entry<Person, List<Animal>> en : set) {
			if(en.getKey().getName().equalsIgnoreCase(name)){
				System.out.println("Enter type of animal");
				String typeOfAnimal = scanner.next();
				System.out.println("Enter animal name");
				String animalName = scanner.next();
				Iterator<Entry<Person, List<Animal>>> iterator = set.iterator();
				while(iterator.hasNext()){
					Iterator<Animal> animalIter =iterator.next().getValue().iterator();
					while(animalIter.hasNext()){
						if(animalIter.next().getType().equalsIgnoreCase(typeOfAnimal)&&animalIter.next().getName().equalsIgnoreCase(animalName)){
							animalIter.remove();
						}
					}
				}
				deleted =true;
			}
		}
		if(!deleted ){
			System.out.println("This member not exist!");
		}
	}
	
	public void removeMember(){
		
	}
	
	public void removeAnimalFromAllMembers(){
		
	}
	
	public void printZooClub(){
		for (Entry<Person, List<Animal>> entry : set) {
			System.out.println(entry);
		}
	}
	
	public void start() {
		System.out.println("Enter 1 to add club member");
		System.out.println("Enter 2 to add animal for club member");
		System.out.println("Enter 3 to remove animal from club member");
		System.out.println("Enter 4 to remove club member");
		System.out.println("Enter 5 to remove animal from all members");
		System.out.println("Enter 6 to print zoo club");
		System.out.println("Enter 7 to exit");
		String user = "";
		do{
			user=scanner.next();
		switch(user){
		case "1":{
			addClubMember();
			break;
		}
		case "2":{
			addAnimalToMember();
			break;
		}
		case "3":{
			removeAnimalFromMember();
			
			break;
		}
		case "4":{
			break;
		}
		case "5":{
			break;
		}
		case "6":{
			printZooClub();
			break;
		}
		case "7":{
			System.exit(0);
			break;
		}
		default:{
			break;
		}
		}
		}while(!user.equals("7"));

	}

}
