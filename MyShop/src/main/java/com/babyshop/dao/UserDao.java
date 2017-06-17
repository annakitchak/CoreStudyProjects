package com.babyshop.dao;

import java.util.List;

import com.babyshop.entity.User;

public interface UserDao {
	void save(User user);
	List<User> findAll();
	User findOne(String name);
	User findByMail(String email);
	void delete(String name);
	void update(User user);
}
