package weatherAppExample;

public class CurrentConditionsDisplay implements DisplayElement,Observer{

    private float temperature, humidity, pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Temperature -> "+temperature+"| humidity-> "+humidity+"| pressure-> "+pressure);
    }


    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
        display();
    }
}
