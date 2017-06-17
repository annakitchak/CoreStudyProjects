package ua.home;

public class Main {

	public static void main(String[] args) {
		Cat cat = new Cat("Kitty", "brown", "blue");
		Jaguar jaguar = new Jaguar("Cruel", true, 46);
		cat.eat();
		cat.voice();
		jaguar.eat();
		jaguar.voice();
		

	}

}
