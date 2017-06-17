package com.babyshop.dao;

import java.util.List;

import com.babyshop.entity.Category;

public interface CategoryDao {
	void save(Category category);
	List<Category> findAll();
	Category findOne(String name);
	void delete(String name);
	void update(Category category);
}
