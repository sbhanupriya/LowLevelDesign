package designpatterns.behavioral.observer.WeatherStation;

public interface Observable {
   void addObserver(Observer observer);
   void removeObserver(Observer observer);
   void notifyObservers();
   int getTemperature();
   void setTemperature(int temperature);
}
