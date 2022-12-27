package com.details.laptop.service;

import com.details.laptop.entity.LaptopEntity;

public interface LaptopService {
  boolean saveAndValidate(LaptopEntity entity);
}
