package ua.home;

public class Pet extends Animal {
	private String color;

	public Pet(String name, String color) {
		super(name);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public void eat(){
		System.out.println("Pet eat food");
	}
}
