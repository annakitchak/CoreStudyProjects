package study;

import java.util.ArrayList;
import java.util.List;

public class Frakcia {
	List<Frakcia>frakcias=new ArrayList<>();
	
	public void addDeputat(){
		System.out.println("������ ���� ��������");
		int userWeight = Main.scanner.nextInt();
		System.out.println("������ ��� ��������");
		int userHeight = Main.scanner.nextInt();
		System.out.println("������ ��'� ��������");
		String userName = Main.scanner.next();
		System.out.println("������ ������� ��������");
		String userLastName = Main.scanner.next();
		System.out.println("������ �� ��������");
		int userAge = Main.scanner.nextInt();
		System.out.println("������ 1, ���� ������� ��������, 2 - ���� �� ��������");
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
