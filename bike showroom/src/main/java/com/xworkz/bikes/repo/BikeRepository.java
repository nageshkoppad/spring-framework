package com.xworkz.bikes.repo;

import java.util.List;
import java.util.Optional;

import com.xworkz.bikes.entity.BikesEntity;

public interface BikeRepository {
boolean save(BikesEntity entity);
default Optional<List<BikesEntity>> findByLocation(String location){
	return Optional.empty();
}
}
