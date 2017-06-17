package com.babyshop.dao;

import java.time.LocalDateTime;
import java.util.List;

import com.babyshop.entity.Orders;

public interface OrdersDao {
	void save(Orders orders);
	List<Orders> findAll();
	Orders findOne(LocalDateTime dateTime);
	void delete(LocalDateTime dateTime);
	void update(Orders orders);
}
