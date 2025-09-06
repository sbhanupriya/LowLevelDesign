package designpatterns.behavioral.observer.YoutubeNotification;



public interface Observable {
    void subsrcribe(Observer observer);
    void unsubsuscribe(Observer observer);
    void notifySubscribers();
}
