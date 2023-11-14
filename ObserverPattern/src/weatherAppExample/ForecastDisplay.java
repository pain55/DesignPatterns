package weatherAppExample;

public class ForecastDisplay implements DisplayElement,Observer{

    private float currentPressure=29.9F;
    private float lastPressure;
    WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        if(lastPressure<currentPressure)
            System.out.println("Nice day, improving weather");
        else if(lastPressure>currentPressure)
            System.out.println("might rain or cloudy");
        else
            System.out.println("No noticeable difference");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {

        lastPressure = currentPressure;
        currentPressure = pressure;
        display();

    }


}
