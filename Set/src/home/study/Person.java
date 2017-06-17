package home.study;

public class Person /*implements Comparable<Person>*/ {
	private String frstName;
	private String lastName;
	private int age;
	public Person(String frstName, String lastName, int age) {
		super();
		this.frstName = frstName;
		this.lastName = lastName;
		this.age = age;
	}
	public String getFrstName() {
		return frstName;
	}
	public void setFrstName(String frstName) {
		this.frstName = frstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [frstName=" + frstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
//	@Override
//	public int compareTo(Person o) {
////		if(this.age> o.getAge()){
////			return 1;
////		}else if(this.age<o.getAge()){   //сортуємо по віку
////			return -1;
////		}else{
////		return 0;
////		}
//		return lastName.compareTo(o.getLastName()); //сортуємо по фамілії
//	}
	
}
