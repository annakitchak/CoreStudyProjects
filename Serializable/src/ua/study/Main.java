package ua.study;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fos = new FileOutputStream("persons.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Person person1 = new Person("anton", 22);
		Person person2 = new Person("ira", 34);
		Person person3 = new Person("ivan", 20);
		Person person4 = new Person("dima", 29);
		Person person5 = new Person("oksana", 33);
//		List<Person> list = new ArrayList<>();
//		list.add(person1);
//		list.add(person2);
//		list.add(person3);
//		
//		oos.writeObject(list);
//		
		oos.writeObject(person1);
		oos.writeObject(person2);
		oos.writeObject(person3);
		oos.writeObject(person4);
		oos.writeObject(person5);
		
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persons.txt"));
//		List<Person> persons = (List<Person>)ois.readObject();
//		for (Person person : persons) {
////			System.out.println(persons);
//			System.out.println(person.getName());
//		}
		Person maxAgePerson = (Person)ois.readObject();
		try{
			while(true){
					Person p =	(Person)ois.readObject();
					if(p.getAge()>maxAgePerson.getAge()){
						maxAgePerson=p;
					}
				System.out.println(maxAgePerson);
			}
		}catch(EOFException e){
			
		
//		try{
//			while(true){
//						
//				System.out.println(ois.readObject());
//			}
//		}catch(EOFException e){
//			
//		}
	}

}
}
