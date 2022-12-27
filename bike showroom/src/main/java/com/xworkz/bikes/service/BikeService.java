package com.xworkz.bikes.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.bikes.entity.BikesEntity;

public interface BikeService {
boolean saveAndValidate(BikesEntity entity);
default Optional<List<BikesEntity>> findByLocation(String location){
	  return Optional.empty();
   }
}
