package com.babyshop.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Size {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String sizeName;
	
	@ManyToMany
	@JoinTable(name = "commodity_size", joinColumns = @JoinColumn(name = "id_size"),
	inverseJoinColumns = @JoinColumn(name = "id_commodity"))
	private List<Commodity> commodities1;
	
	@OneToMany(mappedBy = "size", cascade = CascadeType.REMOVE)
	private List<Commodity> commodities2;
	
	@ManyToMany
	@JoinTable(name = "gender_size", joinColumns = @JoinColumn(name = "id_size"),
	inverseJoinColumns = @JoinColumn(name = "id_gender"))
	private List<GenderCategory> genderCategories;
	
	public Size() {
		super();
	}
	public Size(String sizeName) {
		super();
		this.sizeName = sizeName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSizeName() {
		return sizeName;
	}
	public void setSizeName(String sizeName) {
		this.sizeName = sizeName;
	}
	
	
	
}
