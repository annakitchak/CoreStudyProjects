package ua.study;

public class Auto {
	private String brand;
	private int years;
	public Auto(String brand, int years) {
		super();
		this.brand = brand;
		this.years = years;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	
}
