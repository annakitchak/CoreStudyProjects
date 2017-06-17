package com.babyshop.dao;

import java.util.List;

import com.babyshop.entity.Size;

public interface SizeDao {
	void save(Size size);
	List<Size> findAll();
	Size findOne(String name);
	void delete(String name);
	void update(Size size);
}
