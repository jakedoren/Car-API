package com.example.cars.service;

import com.example.cars.dao.CarRepository;
import com.example.cars.model.Car;
import com.example.cars.utils.CarRequestValidator;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CarDataAccessService {

    private final CarRepository repository;
    private final CarRequestValidator validator;

    public CarDataAccessService(CarRepository repository, CarRequestValidator validator) {
        this.repository = repository;
        this.validator = validator;
    }

    public Car insertCar(Car car) {
        validator.insertCarValidator(car);
        return repository.insert(car);
    }

    public List<Car> getAllCars() {
        return repository.findAll();
    }

}
