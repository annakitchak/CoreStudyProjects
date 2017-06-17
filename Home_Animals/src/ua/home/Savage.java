package ua.home;

public class Savage extends Animal{
	private boolean isBite;

	public Savage(String name, boolean isBite) {
		super(name);
		this.isBite = isBite;
	}

	public boolean isBite() {
		return isBite;
	}

	public void setBite(boolean isBite) {
		this.isBite = isBite;
	}
	public void eat(){
		System.out.println("savage eat animals");
	}
}
