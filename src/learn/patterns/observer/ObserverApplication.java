package learn.patterns.observer;

import learn.patterns.observer.implementations.WeatherData;
import learn.patterns.observer.implementations.observers.ForecastDisplay;
import learn.patterns.observer.implementations.observers.HighLevelDisplay;
import learn.patterns.observer.implementations.observers.StatisticalDisplay;

public class ObserverApplication {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        HighLevelDisplay highLevelDisplay = new HighLevelDisplay(weatherData);
        StatisticalDisplay statisticalDisplay = new StatisticalDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 47, 20);
        weatherData.setMeasurements(43, 22, 60);

        weatherData.removeObserver(highLevelDisplay);

        weatherData.setMeasurements(80, 47, 20);
        weatherData.setMeasurements(43, 22, 60);
    }
}
