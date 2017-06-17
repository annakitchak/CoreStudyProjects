package ua.home;

public class Jaguar extends Savage{
	private int countOfTeeth;
	
	public Jaguar(String name, boolean isBite, int countOfTeeth) {
		super(name, isBite);
		this.countOfTeeth = countOfTeeth;
	}

	public int getCountOfTeeth() {
		return countOfTeeth;
	}

	public void setCountOfTeeth(int countOfTeeth) {
		this.countOfTeeth = countOfTeeth;
	}
	public void eat(){
		System.out.println("savage eat cats");
	}
}
