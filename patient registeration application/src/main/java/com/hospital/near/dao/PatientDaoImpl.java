package com.hospital.near.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospital.near.entity.PatientEntity;
@Component
public class PatientDaoImpl implements PatientDao {

	@Autowired
	private EntityManagerFactory factory;
	@Override
	public boolean save(PatientEntity dao) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tr=manager.getTransaction();
		try {
			tr.begin();
			manager.persist(dao);
			tr.commit();
		}catch(Exception ex) {
			ex.printStackTrace();
			tr.rollback();
		}finally {
			manager.close();
		}
		return false;
	}
	@Override
	public Optional<List<PatientEntity>> findByName(String name) {
		EntityManager manager=factory.createEntityManager();
		try {
			Query query=manager.createNamedQuery("findByName");
			query.setParameter("na", name);
			return Optional.ofNullable(query.getResultList());
		}finally {
			manager.close();
		}
	}
	@Override
	public Optional<List<PatientEntity>> findByAgeGreaterThan(int age) {
		EntityManager manager=factory.createEntityManager();
		try {
			Query query=manager.createNamedQuery("findByAgeGreaterThan");
			query.setParameter("gre", age);
			return Optional.ofNullable(query.getResultList());
		}finally {
			manager.close();
		}
		
	}
	@Override
	public Optional<List<PatientEntity>> findByAgeLesserThan(int age) {
		EntityManager manager=factory.createEntityManager();
		try {
			Query query=manager.createNamedQuery("findByAgeLesserThan");
			query.setParameter("les", age);
			return Optional.ofNullable(query.getResultList());
		}finally {
			manager.close();
		}
	}
}
