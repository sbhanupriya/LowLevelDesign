package designpatterns.observer.StockAvailability.Observable;

import designpatterns.observer.StockAvailability.Observer.NotificationAlertObserver;

public interface StockObservable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubsribers();
    public void setStockCount(int newStockAdded);
    public int getStockCount();
}
