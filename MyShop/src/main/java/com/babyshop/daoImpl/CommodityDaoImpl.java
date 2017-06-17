package com.babyshop.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import com.babyshop.dao.CommodityDao;
import com.babyshop.entity.Commodity;

public class CommodityDaoImpl implements CommodityDao{
	
	private final EntityManager entityManager;
	

	public CommodityDaoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	public void save(Commodity commodity) {
		entityManager.getTransaction().begin();
		entityManager.persist(commodity);
		entityManager.getTransaction().commit();
		
	}

	public List<Commodity> findAll() {
		entityManager.getTransaction().begin();
		List<Commodity> commodities = entityManager.createQuery("from Commodity").getResultList();
		entityManager.getTransaction().commit();
		return commodities;
	}

	public Commodity findOne(String name) {
		Commodity commodity = null;
		entityManager.getTransaction().begin();
		try{
			commodity =(Commodity) entityManager
					.createQuery("select c from Commodity c where c.name =:value").setParameter("value",name)
					.getSingleResult();
			
		}catch(NoResultException e){
			System.out.println(e.getMessage());
		}
		entityManager.getTransaction().commit();
		return commodity;
	}

	public void delete(String name) {
		Commodity commodity = findOne(name);
		entityManager.getTransaction().begin();
		entityManager.remove(commodity);
		entityManager.getTransaction().commit();
		
	}

	public void update(Commodity commodity) {
		entityManager.getTransaction().begin();
		entityManager.merge(commodity);
		entityManager.getTransaction().commit();
		
	}

}
