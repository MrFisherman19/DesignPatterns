package com.mrfisherman.factory.car.ford;

import com.mrfisherman.factory.car.Car;
import com.mrfisherman.factory.car.SteeringWheelPosition;

import java.time.LocalDate;

public class Ford extends Car {

    public Ford(String model, LocalDate dateOfProduction, SteeringWheelPosition steeringWheelPosition) {
        super(model, dateOfProduction, steeringWheelPosition);
    }
}
