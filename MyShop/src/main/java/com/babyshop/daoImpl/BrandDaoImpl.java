package com.babyshop.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import com.babyshop.dao.BrandDao;
import com.babyshop.entity.Brand;
import com.babyshop.entity.Commodity;


public class BrandDaoImpl implements BrandDao{
	private final EntityManager entityManager;
	
	public BrandDaoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	public void save(Brand brand) {
		entityManager.getTransaction().begin();
		entityManager.persist(brand);
		entityManager.getTransaction().commit();
		
	}

	public List<Brand> findAll() {
		entityManager.getTransaction().begin();
		List<Brand> brands = entityManager.createQuery("from Brand").getResultList();
		entityManager.getTransaction().commit();
		return brands;
	}

	public Brand findOne(String name) {
		Brand brand = null;
		entityManager.getTransaction().begin();
		try{
			brand =(Brand) entityManager
					.createQuery("select b from Brand b where b.name =:value").setParameter("value",name)
					.getSingleResult();
			
		}catch(NoResultException e){
			System.out.println(e.getMessage());
		}
		entityManager.getTransaction().commit();
		return brand;
	}

	public void delete(String name) {
		Brand brand = findOne(name);
		entityManager.getTransaction().begin();
		
		entityManager.remove(brand);
		entityManager.getTransaction().commit();
		
	}

	public void update(Brand brand) {
		entityManager.getTransaction().begin();
		entityManager.merge(brand);
		entityManager.getTransaction().commit();
		
	}

}
