package ua.study;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchEvent.Modifier;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.Watchable;
import java.util.List;

public class Person implements Serializable, Externalizable, Watchable{
	private String name;
	int age;
	protected String surname;
	public double weight;
	private List<Integer> in;
	public Person() {
	}
	public Person(String name, int age, String surname, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.surname = surname;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", surname=" + surname + ", weight=" + weight + "]";
	}
	@Override
	public WatchKey register(WatchService watcher, Kind<?>... events) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public WatchKey register(WatchService watcher, Kind<?>[] events, Modifier... modifiers) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
	}
	
	
}
