package com.mrfisherman;

import com.mrfisherman.notification.Observer;
import com.mrfisherman.notification.media.InternetNews;
import com.mrfisherman.notification.media.RadioNews;
import com.mrfisherman.notification.media.TvNews;
import com.mrfisherman.weatherForecast.WeatherForecast;

import java.util.Set;

public class Main {
    public static void main(String[] args) {

        WeatherForecast observable = new WeatherForecast();

        Observer internet = new InternetNews();
        Observer radioNews = new RadioNews();
        Observer tvNews = new TvNews();

        Set<Observer> observers = Set.of(internet, radioNews, tvNews);

        observers.forEach(observable::registerObserver);

        observable.updateForecast(28, 5, 1050);

        observable.unregisterObserver(tvNews);

        observable.updateForecast(26, 7, 1060);
    }
}

