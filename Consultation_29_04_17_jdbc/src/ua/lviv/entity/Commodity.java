package ua.lviv.entity;

public class Commodity {
	private int id;
	private String name;
	private double price;
	private int counter; //скільки товару є на складі
	public Commodity() {
		super();
	}
	public Commodity(String name, double price, int counter) {
		super();
		this.name = name;
		this.price = price;
		this.counter = counter;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	@Override
	public String toString() {
		return "Commodity [id=" + id + ", name=" + name + ", price=" + price + ", counter=" + counter + "]";
	}
	
	
	
}
