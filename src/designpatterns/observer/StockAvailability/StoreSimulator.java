package designpatterns.observer.StockAvailability;

import designpatterns.observer.StockAvailability.Observable.IphoneObservableImpl;
import designpatterns.observer.StockAvailability.Observable.StockObservable;
import designpatterns.observer.StockAvailability.Observer.EmailAlertObserverImpl;
import designpatterns.observer.StockAvailability.Observer.MobileAlertObserverImpl;
import designpatterns.observer.StockAvailability.Observer.NotificationAlertObserver;

public class StoreSimulator {
    public static  void main(String[] args){
        StockObservable observable = new IphoneObservableImpl();

        NotificationAlertObserver emailObserver = new EmailAlertObserverImpl(observable, "abc@gmail.com");
        NotificationAlertObserver phoneObserver = new MobileAlertObserverImpl(observable, "Bhanu");
        NotificationAlertObserver phoneObserver2 = new MobileAlertObserverImpl(observable, "Ayush");

        observable.add(emailObserver);
        observable.add(phoneObserver);
        observable.add(phoneObserver2);

        observable.setStockCount(10);
        observable.setStockCount(0);

    }
}
