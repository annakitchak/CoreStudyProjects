package com.babyshop.dao;

import java.util.List;

import com.babyshop.entity.GenderCategory;

public interface GenderCategoryDao {
	void save(GenderCategory genderCategory);
	List<GenderCategory> findAll();
	GenderCategory findOne(String name);
	void delete(String name);
	void update(GenderCategory genderCategory);
}
