package com.mrfisherman;

import com.mrfisherman.factory.CommonwealthFactory;
import com.mrfisherman.factory.ContinentalFactory;
import com.mrfisherman.factory.Factory;
import com.mrfisherman.factory.car.Car;
import com.mrfisherman.factory.car.bmw.BmwModel;
import com.mrfisherman.factory.car.ford.FordModel;

import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Factory euFactory = new ContinentalFactory();
        Factory ukFactory = new CommonwealthFactory();

        Car euE60 = euFactory.buildBmw(BmwModel.E60);
        Car ukE60 = ukFactory.buildBmw(BmwModel.E60);

        Car ukX5 = ukFactory.buildBmw(BmwModel.X5);
        Car euX5 = euFactory.buildBmw(BmwModel.X5);

        Car euCMax = euFactory.buildFord(FordModel.CMax);
        Car ukCMax = ukFactory.buildFord(FordModel.CMax);

        Car ukFocus = ukFactory.buildFord(FordModel.Focus);
        Car euFocus = euFactory.buildFord(FordModel.Focus);

        List<Car> listOfCars = Arrays.asList(euE60, ukE60, ukX5, euX5, euCMax, ukCMax, ukFocus, euFocus);
        listOfCars.forEach(System.out::println);
    }
}
