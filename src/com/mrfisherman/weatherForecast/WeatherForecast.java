package com.mrfisherman.weatherForecast;

import com.mrfisherman.notification.Observer;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class WeatherForecast implements Observable {

    private final Set<Observer> observers = new HashSet<>();

    private short temperature;
    private int windSpeed;
    private int pressure;

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(this));
    }

    @Override
    public void registerObserver(Observer observer) {
        Optional<Observer> observerOpt = Optional.ofNullable(observer);
        observerOpt.ifPresent(observers::add);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        Optional<Observer> observerOpt = Optional.ofNullable(observer);
        observerOpt.ifPresent(observers::remove);
    }

    public void updateForecast(int temperature, int windSpeed, int pressure) {
        setTemperature((short) temperature);
        setWindSpeed(windSpeed);
        setPressure(pressure);
        notifyObservers();
    }

    public short getTemperature() {
        return temperature;
    }

    public void setTemperature(short temperature) {
        this.temperature = temperature;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "WeatherForecast{" +
                "temperature=" + temperature +
                ", windSpeed=" + windSpeed +
                ", pressure=" + pressure +
                '}';
    }
}
