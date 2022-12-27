package com.details.laptop.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.details.laptop.entity.LaptopEntity;
import com.details.laptop.repository.LaptopRepository;
@Component
public class LaptopServiceImpl implements LaptopService {
@Autowired
	private LaptopRepository repo;
	@Override
	public boolean saveAndValidate(LaptopEntity entity) {
		System.out.println("service method");

		return this.repo.save(entity);
	}

}
