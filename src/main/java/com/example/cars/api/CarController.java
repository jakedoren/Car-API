package com.example.cars.api;

import com.example.cars.service.CarDataAccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.cars.model.Car;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CarController {

    private final CarDataAccessService carDataAccessService;

    @Autowired
    public CarController(CarDataAccessService carDataAccessService) {
        this.carDataAccessService = carDataAccessService;
    }

    @GetMapping
    public String welcomeMessage() {
        return "Hello and welcome to the Car api";
    }

    @GetMapping("/car")
    public List<Car> getAllCars() {
        return carDataAccessService.getAllCars();
    }

    @PostMapping("/car")
    public Car addCar(@RequestBody Car car) {
        return carDataAccessService.insertCar(car);
    }



}
