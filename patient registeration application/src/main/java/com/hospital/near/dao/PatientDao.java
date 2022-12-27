package com.hospital.near.dao;

import java.util.List;
import java.util.Optional;

import com.hospital.near.entity.PatientEntity;

public interface PatientDao {
   boolean save(PatientEntity dao);
   default Optional<List<PatientEntity>> findByName(String name){
		 return Optional.empty();
	 }
	 default Optional<List<PatientEntity>> findByAgeGreaterThan(int age){
		 return Optional.empty();
	 }
	 default Optional<List<PatientEntity>> findByAgeLesserThan(int age){
		 return Optional.empty();
	 }

}
