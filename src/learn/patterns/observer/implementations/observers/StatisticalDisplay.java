package learn.patterns.observer.implementations.observers;

import learn.patterns.observer.implementations.WeatherData;
import learn.patterns.observer.interfaces.CustomObserver;
import learn.patterns.observer.interfaces.DisplayElement;

public class StatisticalDisplay implements CustomObserver, DisplayElement {
    WeatherData weatherData;
    Float humidity;
    Float temperature;

    public StatisticalDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float humidity, float temperature, float pressure) {
        this.humidity = humidity;
        this.temperature = temperature;
        display();
    }

    @Override
    public void display() {
        System.out.println("Statistical Weather Data - Humidity: " + humidity * 123.4 + " Temperature: " + temperature * (37.5 / 18) + " Pressure: " + weatherData.pressure / 2);
    }
}
