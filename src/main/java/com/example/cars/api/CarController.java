package com.example.cars.api;

import com.example.cars.service.CarDataAccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.cars.model.Car;

@RestController
@RequestMapping("/api")
public class CarController {

    private final CarDataAccessService carDataAccessService;

    @Autowired
    public CarController(CarDataAccessService carDataAccessService) {
        this.carDataAccessService = carDataAccessService;
    }

    @GetMapping("/car")
    public String welcomeMessage() {
        return "Hello and welcome to api";
    }

    @PostMapping("/car")
    public Car addCar(@RequestBody Car car) {
        return carDataAccessService.insertCar(car);
    }
}
