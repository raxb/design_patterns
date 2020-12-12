package learn.patterns.observer.implementations.observers;

import learn.patterns.observer.implementations.WeatherData;
import learn.patterns.observer.interfaces.CustomObserver;
import learn.patterns.observer.interfaces.DisplayElement;

public class HighLevelDisplay implements CustomObserver, DisplayElement {
    WeatherData weatherData;
    Float humidity;
    Float temperature;

    public HighLevelDisplay(WeatherData weatherData) {
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
        System.out.println("High Level Weather Data - Humidity: " + humidity + " Temperature: " + temperature + " Pressure: " + weatherData.pressure);
    }
}
