package designpatterns.observer.StockAvailability.Observer;

import designpatterns.observer.StockAvailability.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String emailId;
    StockObservable observable;

    public EmailAlertObserverImpl(StockObservable observable, String emailId){
        this.observable = observable;
        this.emailId = emailId;
    }
    @Override
    public void update() {
        sendEmail(emailId, "Product is in stock, hurry up!!!");
    }

    private void sendEmail(String emailId, String message){
        System.out.println("mail send to " + emailId);
    }
}
