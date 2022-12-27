package com.hospital.near.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hospital.near.dao.PatientDao;
import com.hospital.near.entity.PatientEntity;
@Component
public class PatientServiceImpl implements PatientService {
@Autowired
	private PatientDao dao;
	@Override
	public boolean saveandValiadte(PatientEntity dao) {

		if(dao.getAge()>0 && dao.getEmail().length()>0 && dao.getGender().length()>0 && dao.getId().length()>0  && dao.getMobile().length()>0 && dao.getName().length()>0 && dao.getIdValue().length()>0) {
			this.dao.save(dao);
			return  true;
		}else {
			return this.dao.save(dao);
		}
	}
	@Override
	public Optional<List<PatientEntity>> findByName(String name) {
		// TODO Auto-generated method stub
		return this.dao.findByName(name);
	}
	@Override
	public Optional<List<PatientEntity>> findByAgeGreaterThan(int age) {
		// TODO Auto-generated method stub
		return this.dao.findByAgeGreaterThan(age);
	}
	@Override
	public Optional<List<PatientEntity>> findByAgeLesserThan(int age) {
		// TODO Auto-generated method stub
		return this.dao.findByAgeLesserThan(age);
	}
	

}
