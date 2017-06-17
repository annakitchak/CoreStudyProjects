package ua.home;

public class Menu {
	private Dish [] dishs;

	public Menu(Dish[] dishs) {
		super();
		this.dishs = dishs;
	}

	public Dish[] getDishs() {
		return dishs;
	}

	public void setDishs(Dish[] dishs) {
		this.dishs = dishs;
	}
	
}
