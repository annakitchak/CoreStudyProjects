package ua.study;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		List<Person> persons = new ArrayList<>(Arrays.asList(new Person(1, "James", 23),new Person(2, "max", 34),new Person(3, "mdima", 29)));
		
		System.out.println(persons.stream().max((p1,p2)-> p1.getAge()-p2.getAge()).get());
		
//		BufferedReader bufferedReader = new BufferedReader(new FileReader("persons.txt"));
//		String line ="";
//		List<Person> personsFromFile = new ArrayList<>();
//		String [] infoPerson = null;
//		while((line = bufferedReader.readLine())!=null){
//			infoPerson = line.split(", ");
//			Person person = new Person(Integer.parseInt(infoPerson[0].split("= ")[1]),infoPerson[1].split("= ")[1], Integer.parseInt(infoPerson[2].split("= ")[1]));
//		}
	}

}
