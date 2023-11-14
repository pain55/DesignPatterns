package weatherAppExample;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private static List<Observer> observerList = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;



    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observerList)
            observer.update(this.temperature,this.humidity,this.pressure);
    }

    public void measurementsChanged() {
        notifyObservers();
    }
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
