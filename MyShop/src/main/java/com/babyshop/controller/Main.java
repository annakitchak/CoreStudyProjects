package com.babyshop.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.babyshop.dao.CommodityDao;
import com.babyshop.daoImpl.CommodityDaoImpl;
import com.babyshop.entity.Commodity;
import com.babyshop.entity.User;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		EntityManager manager = factory.createEntityManager();
	//	manager.getTransaction().begin();
		 
		CommodityDao commodityDao = new CommodityDaoImpl(manager);
	//	Commodity commodity = new Commodity(name, price, styleNumber, counter, brand, category, size); ?????????
		
//		Commodity commodity1 = new Commodity("Carters", "pants", 12, 1234545);
//		Commodity commodity2 = new Commodity("Carters", "Shirt", 12, 7238765);
//		Commodity commodity3 = new Commodity("Carters", "Shorts", 9, 62436511);
//		
//		commodityDao.save(commodity1);
//		commodityDao.save(commodity2);
//		commodityDao.save(commodity3);
		
		
		//System.out.println(commodityDao.findAll());
		
		//System.out.println(commodityDao.findOne("shirt"));
		//commodityDao.delete("shorts");
		
//		Commodity detachedCommodity = commodityDao.findOne("pants");
//		detachedCommodity.setName("Dress");
//		commodityDao.update(detachedCommodity);
		
		
		//User user = new User("Dima", "Dimov", "dima@mail", "pass");
		//manager.persist(user);
		
//		manager.getTransaction().commit();
//		manager.close();
//		factory.close();
		

	}

}
