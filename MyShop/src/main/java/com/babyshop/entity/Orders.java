package com.babyshop.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDateTime dateTime;
	
	@ManyToOne
	private User user;
	
	
	@ManyToMany
	@JoinTable(name = "commodity_orders", joinColumns = @JoinColumn(name = "id_orders"),
	inverseJoinColumns = @JoinColumn(name = "id_commodity"))
	private List<Commodity> commodities;
	
	
	public Orders() {
		super();
	}

	

	public Orders(LocalDateTime dateTime) {
		super();
		this.dateTime = dateTime;
	}


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public LocalDateTime getDateTime() {
		return dateTime;
	}



	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public List<Commodity> getCommodities() {
		return commodities;
	}



	public void setCommodities(List<Commodity> commodities) {
		this.commodities = commodities;
	}




	
	
	
}
