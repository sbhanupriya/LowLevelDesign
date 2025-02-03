package designpatterns.observer.StockAvailability.Observer;

import designpatterns.observer.StockAvailability.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String userName;
    StockObservable observable;
    public MobileAlertObserverImpl( StockObservable observabl, String userName){
        this.observable = observable;
        this.userName = userName;
    }
    @Override
    public void update() {
        sendMsgOnMobile(userName, "product is in stock, so hurry up");
    }
    private void sendMsgOnMobile(String user,String msg){
        System.out.println("msg sent to " + user);
    }
}
