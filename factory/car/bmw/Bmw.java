package com.mrfisherman.factory.car.bmw;

import com.mrfisherman.factory.car.Car;
import com.mrfisherman.factory.car.SteeringWheelPosition;

import java.time.LocalDate;

public class Bmw extends Car {

    public Bmw(String model, LocalDate dateOfProduction, SteeringWheelPosition steeringWheelPosition) {
        super(model, dateOfProduction, steeringWheelPosition);
    }
}
