package com.babyshop.dao;

import java.util.List;

import com.babyshop.entity.Brand;

public interface BrandDao {
	void save(Brand brand);
	List<Brand> findAll();
	Brand findOne(String name);
	void delete(String name);
	void update(Brand brand);
}
