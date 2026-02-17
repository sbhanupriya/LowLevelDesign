package designpatterns.behavioral.mediator;

public class AuctionDemo {
    public static void main(String[] args){
        AuctionMediator mediator = new ConcreteAuction();
        Colleague c1 = new Bider("bhanu", mediator);
        Colleague c2 = new Bider("Aditya", mediator);
        Colleague c3 = new Bider("Arjun", mediator);


        c2.placeBid(100);
        c3.placeBid(10000);
    }
}
