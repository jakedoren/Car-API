package com.example.cars.utils;

import com.example.cars.model.Car;
import com.example.cars.service.CarDataAccessService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CarRequestValidator {

    public void insertCarValidator(Car car) {
        if(car.getMake().isBlank() || car.getModel().isBlank()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Please enter in a Make and Model");
        }
        if(car.getPrice() == null || car.getPrice().isNaN()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Please enter a number for a price");
        }
    }

}
