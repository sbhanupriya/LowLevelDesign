package designpatterns.behavioral.observer.StockAvailability;

import designpatterns.behavioral.observer.StockAvailability.Observable.IphoneObservableImpl;
import designpatterns.behavioral.observer.StockAvailability.Observable.StockObservable;
import designpatterns.behavioral.observer.StockAvailability.Observer.EmailAlertObserverImpl;
import designpatterns.behavioral.observer.StockAvailability.Observer.MobileAlertObserverImpl;
import designpatterns.behavioral.observer.StockAvailability.Observer.NotificationAlertObserver;

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
