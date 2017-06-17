
public class Car {
	public void start() {
		System.out.println("You're ready to drive!");
	}
	public void stop(){
		System.out.println("You're arrived!");
	}
	public int drive(int howlong){
		int distance;
		distance = howlong*60;
		return distance;
	}
}
