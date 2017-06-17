package ua.home;

public class Cat extends Pet{
	private String eyeColor;

	public Cat(String name, String color, String eyeColor) {
		super(name, color);
		this.eyeColor = eyeColor;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	public void eat(){
		System.out.println("cat eat wiskas");
	}
	public void voice(){
		System.out.println("meow meow");
	}
	
}
