package core.study;

public abstract class Car extends Transport {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract void drive();
	public void stop(){
		System.out.println("car stop");
	}
}
