package com.mrfisherman.factory.car;

import java.time.LocalDate;

public abstract class Car {

    private final String model;
    private final LocalDate dateOfProduction;
    private final SteeringWheelPosition steeringWheelPosition;

    protected Car(String model, LocalDate dateOfProduction, SteeringWheelPosition steeringWheelPosition) {
        this.model = model;
        this.dateOfProduction = dateOfProduction;
        this.steeringWheelPosition = steeringWheelPosition;
    }

    public SteeringWheelPosition getSteeringWheelPosition() {
        return steeringWheelPosition;
    }

    public LocalDate getDateOfProduction() {
        return dateOfProduction;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", dateOfProduction=" + dateOfProduction +
                ", steeringWheelPosition=" + steeringWheelPosition +
                '}';
    }
}
