package com.babyshop.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.*;

@Entity
public class Commodity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	//private String brand;
	private String name;
	private int price;
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int styleNumber;
	private int counter;
	
	@ManyToOne
	private Brand brand;
	
	@ManyToOne
	private Category category;
	
	@ManyToOne
	private Size size;
	
	@ManyToMany
	@JoinTable(name = "commodity_size", joinColumns = @JoinColumn(name = "id_commodity"),
	inverseJoinColumns = @JoinColumn(name = "id_size"))
	private List<Size> sizes;
	
	@ManyToMany
	@JoinTable(name = "commodity_orders", joinColumns = @JoinColumn(name = "id_commodity"),
	inverseJoinColumns = @JoinColumn(name = "id_orders"))
	private List<Orders> orders;
	
	
	
	public Commodity() {
		super();
	}
	
	

//	public Commodity(String name, int price, int styleNumber) {
//		super();
//		this.name = name;
//		this.price = price;
//		this.styleNumber = styleNumber;
//	}



	public Commodity(String name, int price, int styleNumber, int counter, Brand brand, Category category, Size size) {
		super();
		this.name = name;
		this.price = price;
		this.styleNumber = styleNumber;
		this.counter = counter;
		this.brand = brand;
		this.category = category;
		this.size = size;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStyleNumber() {
		return styleNumber;
	}

	public void setStyleNumber(int styleNumber) {
		this.styleNumber = styleNumber;
	}

	@Override
	public String toString() {
		return "Commodity [id=" + id + ", brand=" + brand + ", name=" + name + ", price=" + price + ", styleNumber="
				+ styleNumber + "]";
	}




	
	
}
