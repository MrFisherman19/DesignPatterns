package com.mrfisherman.notification.media;

import com.mrfisherman.notification.Observer;
import com.mrfisherman.weatherForecast.WeatherForecast;

public class InternetNews implements Observer {
    @Override
    public void update(WeatherForecast forecast) {
        System.out.println("www.weatherObserver.com is now updated! Current forecast: " + forecast);
    }
}
