package com.xworkz.stops.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.stops.entity.BusEntity;
import com.xworkz.stops.repository.BusRepository;
@Component
public class BusServiceImpl implements BusService {

	@Autowired
	private BusRepository repo;
	@Override
	public boolean saveAndValidate(BusEntity entity) {
		repo.save(entity);
		return false;
	}

}
