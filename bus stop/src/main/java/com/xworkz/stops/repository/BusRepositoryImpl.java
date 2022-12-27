package com.xworkz.stops.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.hibernate.engine.jdbc.spi.SqlExceptionHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.stops.entity.BusEntity;
@Component
public class BusRepositoryImpl implements BusRepository {
     @Autowired
	private EntityManagerFactory factory;
	@Override
	public boolean save(BusEntity entity) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction  tran=manager.getTransaction();
		try {
			tran.begin();
			manager.persist(entity);
			tran.commit();
		}catch(Exception h) {
			h.printStackTrace();
			tran.rollback();
		}finally {
			manager.clear();
		}
		return false;
	}

}
