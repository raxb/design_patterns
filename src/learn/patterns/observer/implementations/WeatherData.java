package learn.patterns.observer.implementations;

import learn.patterns.observer.interfaces.CustomObserver;
import learn.patterns.observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    public float humidity;
    public float temperature;
    public float pressure;
    List<CustomObserver> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(CustomObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(CustomObserver o) {
        int ObserverPosition = observers.indexOf(o);
        if (ObserverPosition >= 0) {
            observers.remove(ObserverPosition);
        }
    }

    @Override
    public void notifyObservers() {
        for (CustomObserver observer : observers) {
            observer.update(humidity, temperature, pressure);
        }
    }

    public void setMeasurements(float humidity, float temperature, float pressure) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
        notifyObservers();
    }
}
