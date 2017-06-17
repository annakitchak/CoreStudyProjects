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
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String categoryName;
	
	@OneToMany(mappedBy = "category", cascade = CascadeType.REMOVE)
	private List<Commodity> commodities;
	
	@ManyToMany
	@JoinTable(name = "category_gender", joinColumns = @JoinColumn(name = "id_category"),
	inverseJoinColumns = @JoinColumn(name = "id_gender"))
	private List<GenderCategory> genderCategories;
	
	public Category() {
		super();
	}
	public Category(String categoryName) {
		super();
		this.categoryName = categoryName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	
}
