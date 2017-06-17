package com.babyshop.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import com.babyshop.dao.GenderCategoryDao;
import com.babyshop.entity.Commodity;
import com.babyshop.entity.GenderCategory;

public class GenderCategoryDaoImpl implements GenderCategoryDao {
	
	private final EntityManager entityManager;
	

	public GenderCategoryDaoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	public void save(GenderCategory genderCategory) {
		entityManager.getTransaction().begin();
		entityManager.persist(genderCategory);
		entityManager.getTransaction().commit();
		
	}

	public List<GenderCategory> findAll() {
		entityManager.getTransaction().begin();
		List<GenderCategory> genderCategories = entityManager.createQuery("from GenderCategory").getResultList();
		entityManager.getTransaction().commit();
		return genderCategories;
	}

	public GenderCategory findOne(String name) {
		GenderCategory genderCategory = null;
		entityManager.getTransaction().begin();
		try{
			genderCategory =(GenderCategory) entityManager
					.createQuery("select g from GenderCategory g where g.name =:value").setParameter("value",name)
					.getSingleResult();
			
		}catch(NoResultException e){
			System.out.println(e.getMessage());
		}
		entityManager.getTransaction().commit();
		return genderCategory;
	}

	public void delete(String name) {
		GenderCategory genderCategory = findOne(name);
		entityManager.getTransaction().begin();
		entityManager.remove(genderCategory);
		entityManager.getTransaction().commit();
	}

	public void update(GenderCategory genderCategory) {
		entityManager.getTransaction().begin();
		entityManager.merge(genderCategory);
		entityManager.getTransaction().commit();
	}

}
