package ua.home;

public class Human {
	private String name;
	private String type;
	private int age;
	public Human(String name, String type, int age) {
		super();
		this.name = name;
		this.type = type;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void typeOfHuman(){
		
	}
	
	@Override
	public String toString() {
		return "Engine [power=" + name + " " + type + " " + age + "]";
	}
	
}
