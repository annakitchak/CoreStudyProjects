package com.babyshop.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class GenderCategory {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String genderName;
	
	@ManyToMany
	@JoinTable(name = "category_gender", joinColumns = @JoinColumn(name = "id_gender"),
	inverseJoinColumns = @JoinColumn(name = "id_category"))
	private List<Category> categories;
	
	@ManyToMany
	@JoinTable(name = "gender_size", joinColumns = @JoinColumn(name = "id_gender"),
	inverseJoinColumns = @JoinColumn(name = "id_size"))
	private List<Size> sizes;
	
	public GenderCategory() {
		super();
	}
	public GenderCategory(String genderName) {
		super();
		this.genderName = genderName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGenderName() {
		return genderName;
	}
	public void setGenderName(String genderName) {
		this.genderName = genderName;
	}
	
	
	
}
