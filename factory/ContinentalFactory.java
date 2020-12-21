package com.mrfisherman.factory;

import com.mrfisherman.factory.car.Car;
import com.mrfisherman.factory.car.SteeringWheelPosition;
import com.mrfisherman.factory.car.bmw.Bmw;
import com.mrfisherman.factory.car.bmw.BmwModel;
import com.mrfisherman.factory.car.ford.Ford;
import com.mrfisherman.factory.car.ford.FordModel;

import java.time.LocalDate;

import static com.mrfisherman.factory.car.bmw.BmwModel.*;
import static com.mrfisherman.factory.car.ford.FordModel.*;

public class ContinentalFactory implements Factory {

    private final static SteeringWheelPosition STEERING_WHEEL_POSITION = SteeringWheelPosition.RIGHT;

    @Override
    public Car buildBmw(BmwModel bmwModel) {
        switch (bmwModel) {
            case X5:
                return new Bmw(X5.name(), LocalDate.of(2005, 12, 10), STEERING_WHEEL_POSITION);
            case E60:
                return new Bmw(E60.name(), LocalDate.of(2001, 11, 20), STEERING_WHEEL_POSITION);
            default:
                throw new UnsupportedOperationException("There is no such BMW model!");
        }
    }

    @Override
    public Car buildFord(FordModel fordModel) {
        switch (fordModel) {
            case CMax:
                return new Ford(CMax.name(), LocalDate.of(2007, 2, 10), STEERING_WHEEL_POSITION);
            case Focus:
                return new Ford(Focus.name(), LocalDate.of(2012, 4, 12), STEERING_WHEEL_POSITION);
            default:
                throw new UnsupportedOperationException("There is no such Ford model!");
        }
    }
}
