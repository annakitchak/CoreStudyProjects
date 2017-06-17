package com.babyshop.dao;

import java.util.List;

import com.babyshop.entity.Commodity;

public interface CommodityDao {
	void save(Commodity commodity);
	List<Commodity> findAll();
	Commodity findOne(String name);
	void delete(String name);
	void update(Commodity commodity);
}
