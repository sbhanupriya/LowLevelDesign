package designpatterns.behavioral.observer.WeatherStation;

public class WeatherStationExecutor {
    public static void main(String[] args){
        Observable observable = new WeatherStation();
        Observer observer = new DisplayElement(observable);
        observable.setTemperature(100);
    }
}
