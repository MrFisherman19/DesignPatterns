package com.mrfisherman.factory;

import com.mrfisherman.factory.car.bmw.BmwModel;
import com.mrfisherman.factory.car.Car;
import com.mrfisherman.factory.car.ford.FordModel;

public interface Factory {

    Car buildBmw(BmwModel bmwModel);
    Car buildFord(FordModel fordModel);

}
