package com.mrfisherman.factory;

import com.mrfisherman.factory.car.Car;
import com.mrfisherman.factory.car.SteeringWheelPosition;
import com.mrfisherman.factory.car.bmw.Bmw;
import com.mrfisherman.factory.car.bmw.BmwModel;

import static com.mrfisherman.factory.car.bmw.BmwModel.*;
import static com.mrfisherman.factory.car.ford.FordModel.*;

import com.mrfisherman.factory.car.ford.Ford;
import com.mrfisherman.factory.car.ford.FordModel;

import java.time.LocalDate;

public class CommonwealthFactory implements Factory {

    private final static SteeringWheelPosition STEERING_WHEEL_POSITION = SteeringWheelPosition.LEFT;

    @Override
    public Car buildBmw(BmwModel bmwModel) {
        switch (bmwModel) {
            case X5:
                return new Bmw(X5.name(), LocalDate.of(2010, 12, 10), STEERING_WHEEL_POSITION);
            case E60:
                return new Bmw(E60.name(), LocalDate.of(2006, 10, 20), STEERING_WHEEL_POSITION);
            default:
                throw new UnsupportedOperationException("There is no such BMW model!");
        }
    }

    @Override
    public Car buildFord(FordModel fordModel) {
        switch (fordModel) {
            case CMax:
                return new Ford(CMax.name(), LocalDate.of(2009, 5, 10), STEERING_WHEEL_POSITION);
            case Focus:
                return new Ford(Focus.name(), LocalDate.of(2005, 1, 12), STEERING_WHEEL_POSITION);
            default:
                throw new UnsupportedOperationException("There is no such Ford model!");
        }
    }
}
