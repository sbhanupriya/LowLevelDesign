package designpatterns.behavioral.observer.WeatherStation;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements  Observable {
    private int temperature;
    private List<Observer> observerList;
    public WeatherStation(){
        observerList = new ArrayList<>();
        temperature = 0;
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observerList){
            observer.update();
        }
    }

    public void setTemperature(int temperature){
        if(Math.abs(temperature-this.temperature)>5){
            this.temperature = temperature;
            notifyObservers();
        }
        this.temperature = temperature;
    }

    public int getTemperature(){
        return temperature;
    }
}
