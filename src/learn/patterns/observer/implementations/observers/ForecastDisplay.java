package learn.patterns.observer.implementations.observers;

import learn.patterns.observer.implementations.WeatherData;
import learn.patterns.observer.interfaces.CustomObserver;
import learn.patterns.observer.interfaces.DisplayElement;

public class ForecastDisplay implements CustomObserver, DisplayElement {
    WeatherData weatherData;
    Float humidity;
    Float temperature;

    public ForecastDisplay(WeatherData weatherData) {
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
        if (humidity % 2 == 0) {
            System.out.println("Weather seems to be terrible");
        } else {
            System.out.println("It is a pleasant weather, time for picnic");
        }
    }
}
