package com.shop.mobile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shop.mobile.entity.MobileEntity;
import com.shop.mobile.repository.MobileRepository;
@Component
public class MobileServiceImpl implements MobileService {

	@Autowired
	private MobileRepository repo;
	@Override
	public boolean saveAndValidate(MobileEntity entity) {
		System.out.println("service method");
		return this.repo.save(entity);
	}

}
