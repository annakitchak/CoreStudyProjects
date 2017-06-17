package ua.study;

public class Main {

	public static void main(String[] args) {
		Vizard vizard = new Vizard();
		Dracula dracula = new Dracula();
		vizard.callToPerson(dracula);
		Fairy fairy = new Fairy();
		vizard.callToPerson(fairy);
	}

}
