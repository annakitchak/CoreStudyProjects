package home.study;

import home.study.Main;

public class Deputy extends Human {
	private String firstName;
	private String lastName;
	private int age;
	private boolean grafter;
	private int bribeSize;
	
	public Deputy(int weight, int height, String firstName, String lastName, int age, boolean grafter) {
		super(weight, height);
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.grafter = grafter;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirlstName(String firstName) {
		this.firstName = firstName;
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
	public boolean isGrafter() {
		return grafter;
	}
	public void setGrafter(boolean grafter) {
		this.grafter = grafter;
	}
	public int getBribeSize() {
		return bribeSize;
	}
	public void setBribeSize(int bribeSize) {
		this.bribeSize = bribeSize;
	}
	
	
	public void giveBribe(){
		if(grafter==false){
			System.out.println("This deputy didn't take bribes!");
		}else{
			System.out.println("Enter the amount of bribe.");
			int user = Main.scanner.nextInt();
			if(Main.scanner.hasNextInt()){
			if(user>5000){
				System.out.println("Police catch the briber!");
			}else{
				bribeSize=user;
			}
			}else{
				System.out.println("Wrong input! Try again.");
			}
		}
	}
	@Override
	public String toString() {
		return "Deputy [firlstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", grafter=" + grafter
				+ ", bribeSize=" + bribeSize + "]";
	}
	
}
