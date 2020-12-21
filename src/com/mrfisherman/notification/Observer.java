package com.mrfisherman.notification;

import com.mrfisherman.weatherForecast.WeatherForecast;

public interface Observer {

    void update(WeatherForecast observable);
}
