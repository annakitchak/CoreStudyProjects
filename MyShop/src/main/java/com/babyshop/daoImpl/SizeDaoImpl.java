package com.babyshop.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import com.babyshop.dao.SizeDao;
import com.babyshop.entity.Commodity;
import com.babyshop.entity.Size;

public class SizeDaoImpl implements SizeDao{
	
	private final EntityManager entityManager;
	
	public SizeDaoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	public void save(Size size) {
		entityManager.getTransaction().begin();
		entityManager.persist(size);
		entityManager.getTransaction().commit();
	}

	public List<Size> findAll() {
		entityManager.getTransaction().begin();
		List<Size> sizes = entityManager.createQuery("from Size").getResultList();
		entityManager.getTransaction().commit();
		return sizes;
	}

	public Size findOne(String name) {
		Size size = null;
		entityManager.getTransaction().begin();
		try{
			size =(Size) entityManager
					.createQuery("select s from Size s where s.name =:value").setParameter("value",name)
					.getSingleResult();
			
		}catch(NoResultException e){
			System.out.println(e.getMessage());
		}
		entityManager.getTransaction().commit();
		return size;
	}

	public void delete(String name) {
		Size size = findOne(name);
		entityManager.getTransaction().begin();
		entityManager.remove(size);
		entityManager.getTransaction().commit();
	}

	public void update(Size size) {
		entityManager.getTransaction().begin();
		entityManager.merge(size);
		entityManager.getTransaction().commit();
	}

}
