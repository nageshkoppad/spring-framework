package com.details.laptop.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.details.laptop.entity.LaptopEntity;
@Component
public class LaptopRepositoryImpl implements LaptopRepository {

	@Autowired
	private EntityManagerFactory factory;
	@Override
	public boolean save(LaptopEntity entity) {
		System.out.println("repository method");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tran=manager.getTransaction();
		try {
			tran.begin();
			manager.persist(entity);
			tran.commit();
		}catch(Exception ex) {
			ex.printStackTrace();
			tran.rollback();
		}finally {
			manager.clear();
		}
		return true;
	}

}
