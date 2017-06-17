package com.babyshop.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Brand {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String brandName;
	
	@OneToMany(mappedBy = "brand", cascade = CascadeType.REMOVE)
	private List<Commodity> commodities;
	
	
	
	public Brand() {
		super();
	}
	public Brand(String brandName) {
		super();
		this.brandName = brandName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	

}
