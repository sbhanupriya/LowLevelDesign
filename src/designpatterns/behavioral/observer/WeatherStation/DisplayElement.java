package designpatterns.behavioral.observer.WeatherStation;

public class DisplayElement implements Observer{
    private Observable observable;
    public DisplayElement(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void update() {
        System.out.println("The temperature is " + observable.getTemperature());
    }
}
