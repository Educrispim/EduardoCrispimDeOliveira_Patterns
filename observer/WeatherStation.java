package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private List<TemperatureObserver> observers;
    private double temperature;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    public void subscribe(TemperatureObserver observer) {
        observers.add(observer);
    }

    public void unsubscribe(TemperatureObserver observer) {
        observers.remove(observer);
    }

    public void setTemperature(double temp) {
        this.temperature = temp;
        notifyObservers();
    }

    private void notifyObservers() {
        for (TemperatureObserver observer : observers) {
            observer.onTemperatureChanged(temperature);
        }
    }
}
