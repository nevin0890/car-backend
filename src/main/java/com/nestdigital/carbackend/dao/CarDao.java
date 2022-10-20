package com.nestdigital.carbackend.dao;

import com.nestdigital.carbackend.model.CarModel;
import org.springframework.data.repository.CrudRepository;

public interface CarDao extends CrudRepository<CarModel,Integer> {
}
