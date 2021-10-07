package com.example.cars.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.UUID;

@Document
@Data
public class Car {

    @Id
    private String id;
    @Field
    private String make;
    @Field
    private String model;
    @Field
    private Double price;

    public Car(String make, String model, Double price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }
}
