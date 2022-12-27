package com.shop.mobile.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shop.mobile.entity.MobileEntity;
@Component
public class MobileRepositoryImpl implements MobileRepository {
	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean save(MobileEntity entity) {
		System.out.println("mobilerepo method");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tra = manager.getTransaction();
		try {
			tra.begin();
			manager.persist(entity);
			tra.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			tra.rollback();
		} finally {
			manager.close();
		}
		return true;
	}

}
