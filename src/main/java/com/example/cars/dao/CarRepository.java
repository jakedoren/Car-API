package com.example.cars.dao;

import com.example.cars.model.Car;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CarRepository extends MongoRepository<Car, String> {
}
