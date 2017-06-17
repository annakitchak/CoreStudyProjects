package home.study;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//створити клас(будь-який) описати його будь-якими полями (обов*язково має бути Id поле)
//створити базу даних у вигляді файлу, організувати до неї такі методи :
//press 1 to show data
//press 2 to find by id number
//press 3 to remove by id number
//press 4 to add new into data(зробити переівку по ід, щоб не було дублювання)
//press 5 to update information
//файл має бути читабельним

public class Main {

	public static void main(String[] args) throws IOException {
		File file = new File("DataBase.txt");
		file.createNewFile();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press 1 to show data.");
		System.out.println("Press 2 to find by id number.");
		System.out.println("Press 3 to remove by id number.");
		System.out.println("Press 4 to add new into data.");
		System.out.println("Press 5 to update information.");
		System.out.println("Press 6 to exit");
		String user = "";
		do{
			user = scanner.next();
			switch(user){
			case "1":{
				FileInputStream fileInputStream = new FileInputStream(file);
				int temp;
				while((temp = fileInputStream.read()) != -1){
					System.out.print(Character.toChars(temp));
				}
				fileInputStream.close();
				break;
			}
			case "2":{
				break;
			}
			case "3":{
				break;
			}
			case "4":{
				System.out.println("Enter id");
				String id = scanner.next();
				System.out.println("Enter person's name");
				String name = scanner.next();
				System.out.println("Enter person's surname");
				String surname = scanner.next();
				
				Person person = new Person(id, name, surname);
//				List<Person>list=new ArrayList<>();
//				list.add(person);
				
				String [] line = {"id "+person.getId(),"name "+person.getName(),"surname "+person.getSurname()};
				FileWriter fileWriter = new FileWriter(file);
				fileWriter.write(person.toString());
				fileWriter.flush();
				fileWriter.close();
				
				
				break;
			}
			case "5":{
				break;
			}
			case "6":{
				System.exit(0);
				break;
			}
			}
		}while(!user.equals("6"));

	}

}
