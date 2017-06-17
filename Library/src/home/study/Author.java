package home.study;

public class Author extends Human {
	private String name;
	private String surname;
	public Author(int height, int weight, int age, String name, String surname) {
		super(height, weight, age);
		this.name = name;
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	@Override
	public String toString() {
		return "Author [name=" + name + ", surname=" + surname + "]";
	}
	
		
}
