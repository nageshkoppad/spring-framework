package com.details.laptop.repository;

import com.details.laptop.entity.LaptopEntity;

public interface LaptopRepository {
  boolean save(LaptopEntity entity);
}
