package com.babyshop.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import com.babyshop.dao.UserDao;
import com.babyshop.entity.Commodity;
import com.babyshop.entity.User;

public class UserDaoImpl implements UserDao{
	
	private final EntityManager entityManager;
	

	public UserDaoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	public void save(User user) {
		entityManager.getTransaction().begin();
		entityManager.persist(user);
		entityManager.getTransaction().commit();
	}

	public List<User> findAll() {
		entityManager.getTransaction().begin();
		List<User> users = entityManager.createQuery("from User").getResultList();
		entityManager.getTransaction().commit();
		return users;
	}

	public User findOne(String name) {
		User user = null;
		entityManager.getTransaction().begin();
		try{
			user =(User) entityManager
					.createQuery("select u from User u where u.name =:value").setParameter("value",name)
					.getSingleResult();
			
		}catch(NoResultException e){
			System.out.println(e.getMessage());
		}
		entityManager.getTransaction().commit();
		return user;
	}

	public void delete(String name) {
		User user = findOne(name);
		entityManager.getTransaction().begin();
		entityManager.remove(user);
		entityManager.getTransaction().commit();
	}

	public void update(User user) {
		entityManager.getTransaction().begin();
		entityManager.merge(user);
		entityManager.getTransaction().commit();
	}

	public User findByMail(String email) {
		User user = null;
		entityManager.getTransaction().begin();
		try{
			user =(User) entityManager
					.createQuery("select u from User u where u.email =:value").setParameter("value",email)
					.getSingleResult();
			
		}catch(NoResultException e){
			System.out.println(e.getMessage());
		}
		entityManager.getTransaction().commit();
		return user;
	}

}
