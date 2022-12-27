package com.xworkz.bikes.repo;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.bikes.entity.BikesEntity;
@Component
public class BikeRepoImpl implements BikeRepository {

	@Autowired
	private EntityManagerFactory factory;
	@Override
	public boolean save(BikesEntity entity) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(entity);
			transaction.commit();
		} catch (Exception e) {
		
			transaction.rollback();
		}finally {
			manager.close();
		}
		return false;
	}
	@Override
	public Optional<List<BikesEntity>> findByLocation(String location) {
		EntityManager manager=factory.createEntityManager();
		try {
		Query query=manager.createNamedQuery("findByLocation");
		query.setParameter("lk", location);
		return Optional.ofNullable(query.getResultList());
		}finally {
			manager.close();
		}
	}
	

}
