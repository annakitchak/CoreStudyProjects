package ua.study;

public class Dracula extends Monster implements Vampire{
	

	@Override
	public void scarePeople() {
		System.out.println("Dracula scare people");
		
	}

	@Override
	public void suckBlood() {
		System.out.println("Dracula suck blood");
		
	}
	
	
}
