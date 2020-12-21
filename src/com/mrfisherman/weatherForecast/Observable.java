package com.mrfisherman.weatherForecast;

import com.mrfisherman.notification.Observer;

public interface Observable {

    void notifyObservers();

    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);
}
