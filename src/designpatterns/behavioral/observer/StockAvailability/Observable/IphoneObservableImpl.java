package designpatterns.behavioral.observer.StockAvailability.Observable;

import designpatterns.behavioral.observer.StockAvailability.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable {
    public int stockCount = 0;
    public List<NotificationAlertObserver> list = new ArrayList<>();
    @Override
    public void add(NotificationAlertObserver observer) {
        list.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        list.remove(observer);
    }

    @Override
    public void notifySubsribers() {
        for(NotificationAlertObserver observer: list){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockCount==0){
            notifySubsribers();
        }
        stockCount += newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
