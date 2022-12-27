package com.xworkz.bikes.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.bikes.entity.BikesEntity;
import com.xworkz.bikes.repo.BikeRepository;
@Component
public class BikeServiceImpl implements BikeService {

	@Autowired
  private BikeRepository repo;
	@Override
	public boolean saveAndValidate(BikesEntity entity) {
		ValidatorFactory buildDefaultValidatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = buildDefaultValidatorFactory.getValidator();
		Set<ConstraintViolation<BikesEntity>> validate = validator.validate(entity);
		if (entity.getOwner().length()>0 && entity.getAmbassador().length()>0 && entity.getBrand().length()>0  && entity.getLocation().length()>0 && entity.getDescsription().length()>0) {
			System.out.println("data is not saved fix the errors");
			return true;
		} else {
			System.out.println("data ia valid and saved");
			return this.repo.save(entity);
		}
	
	}
	@Override
	public Optional<List<BikesEntity>> findByLocation(String location) {
		
		return this.repo.findByLocation(location);
	}
}
