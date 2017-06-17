package com.babyshop.daoImpl;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import com.babyshop.dao.OrdersDao;
import com.babyshop.entity.Commodity;
import com.babyshop.entity.Orders;

public class OrdersDaoImpl implements OrdersDao{
	
	private final EntityManager entityManager;
	

	public OrdersDaoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	public void save(Orders orders) {
		entityManager.getTransaction().begin();
		entityManager.persist(orders);
		entityManager.getTransaction().commit();
	}

	public List<Orders> findAll() {
		entityManager.getTransaction().begin();
		List<Orders> orderses = entityManager.createQuery("from Orders").getResultList();
		entityManager.getTransaction().commit();
		return orderses;
	}

	public Orders findOne(LocalDateTime localDateTime) {
		Orders orders = null;
		entityManager.getTransaction().begin();
		try{
			orders =(Orders) entityManager
					.createQuery("select o from Orders o where o.date =:value").setParameter("value",localDateTime)
					.getSingleResult();
			
		}catch(NoResultException e){
			System.out.println(e.getMessage());
		}
		entityManager.getTransaction().commit();
		return orders;
	}

	public void delete(LocalDateTime localDateTime) {
		Orders orders = findOne(localDateTime);
		entityManager.getTransaction().begin();
		entityManager.remove(orders);
		entityManager.getTransaction().commit();
	}

	public void update(Orders orders) {
		entityManager.getTransaction().begin();
		entityManager.merge(orders);
		entityManager.getTransaction().commit();
		
	}

}
