package study;

import java.util.ArrayList;
import java.util.List;

public class Frakcia {
	List<Frakcia>frakcias=new ArrayList<>();
	
	public void addDeputat(){
		System.out.println("¬вед≥ть вагу депутата");
		int userWeight = Main.scanner.nextInt();
		System.out.println("¬вед≥ть р≥ст депутата");
		int userHeight = Main.scanner.nextInt();
		System.out.println("¬вед≥ть ≥м'€ депутата");
		String userName = Main.scanner.next();
		System.out.println("¬вед≥ть пр≥звище депутата");
		String userLastName = Main.scanner.next();
		System.out.println("¬вед≥ть в≥к депутата");
		int userAge = Main.scanner.nextInt();
		System.out.println("¬вед≥ть 1, €кщо депутат хабарник, 2 - €кщо не хабарник");
		String userH = Main.scanner.next();
		switch(userH){
		case "1":{
			Deputat deputat=new Deputat(userWeight, userHeight, userName, userLastName, userAge, true);
			break;
		}
		case "2":{
			Deputat deputat=new Deputat(userWeight, userHeight, userName, userLastName, userAge, false);
			break;
		}
		default:{
			break;
		}
		
		}
	}

	@Override
	public String toString() {
		return "Frakcia [frakcias=" + frakcias + "]";
	}
	
}
