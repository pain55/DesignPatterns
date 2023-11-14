package weatherAppExample;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(33.3F,65.9F,90);

        weatherData.setMeasurements(20.3F,55.9F,80);



        weatherData.deleteObserver(statisticsDisplay);

        weatherData.setMeasurements(43.3F,56.9F,120);

    }
}
