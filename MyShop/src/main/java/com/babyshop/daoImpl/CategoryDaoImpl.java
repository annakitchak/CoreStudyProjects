package com.babyshop.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import com.babyshop.dao.CategoryDao;
import com.babyshop.entity.Category;
import com.babyshop.entity.Commodity;

public class CategoryDaoImpl implements CategoryDao{
	
	private final EntityManager entityManager;
	

	public CategoryDaoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	public void save(Category category) {
		entityManager.getTransaction().begin();
		entityManager.persist(category);
		entityManager.getTransaction().commit();
		
	}

	public List<Category> findAll() {
		entityManager.getTransaction().begin();
		List<Category> categories = entityManager.createQuery("from Category").getResultList();
		entityManager.getTransaction().commit();
		return categories;
	}

	public Category findOne(String name) {
		Category category = null;
		entityManager.getTransaction().begin();
		try{
			category =(Category) entityManager
					.createQuery("select c from Category c where c.name =:value").setParameter("value",name)
					.getSingleResult();
			
		}catch(NoResultException e){
			System.out.println(e.getMessage());
		}
		entityManager.getTransaction().commit();
		return category;
	}

	public void delete(String name) {
		Category category = findOne(name);
		entityManager.getTransaction().begin();
		
		entityManager.remove(category);
		entityManager.getTransaction().commit();
		
	}

	public void update(Category category) {
		entityManager.getTransaction().begin();
		entityManager.merge(category);
		entityManager.getTransaction().commit();
	}

}
