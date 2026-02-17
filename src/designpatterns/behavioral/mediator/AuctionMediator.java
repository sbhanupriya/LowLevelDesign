package designpatterns.behavioral.mediator;

public interface AuctionMediator {
    void addBider(Colleague col);
    void placeBid(Colleague col, int amount);
}
