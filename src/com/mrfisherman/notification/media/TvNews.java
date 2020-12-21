package com.mrfisherman.notification.media;

import com.mrfisherman.notification.Observer;
import com.mrfisherman.weatherForecast.WeatherForecast;

public class TvNews implements Observer {
    @Override
    public void update(WeatherForecast forecast) {
        System.out.println("WeatherObserver TV is now updated! Current forecast: " + forecast);
    }
}
