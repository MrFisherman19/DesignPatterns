package com.mrfisherman.notification.media;

import com.mrfisherman.notification.Observer;
import com.mrfisherman.weatherForecast.WeatherForecast;

public class RadioNews implements Observer {
    @Override
    public void update(WeatherForecast forecast) {
        System.out.println("Radio WeatherObserver is now updated! Current forecast: " + forecast);
    }
}
