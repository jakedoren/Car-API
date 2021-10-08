package com.example.cars.service;

import com.example.cars.dao.CarRepository;
import com.example.cars.model.Car;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CarDataAccessService {

    private final CarRepository repository;

    public CarDataAccessService(CarRepository repository) {
        this.repository = repository;
    }

    public Car insertCar(Car car) {
        if(car.getMake().isBlank() || car.getModel().isBlank()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Please enter in a Make and Model");
        }
        if(car.getPrice() == null || car.getPrice().isNaN()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Please enter a number for a price");
        }
        return repository.insert(car);
    }

}
