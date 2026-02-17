package designpatterns.behavioral.mediator;

public interface Colleague {
    void placeBid(int amount);
    void recieveBidNotification(int amount);
    String getName();
}
