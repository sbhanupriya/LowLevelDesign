package designpatterns.behavioral.mediator;

public class Bider implements Colleague{
    private String name;
    private AuctionMediator mediator;

    public Bider(String name, AuctionMediator mediator){
        this.name = name;
        this.mediator = mediator;
        mediator.addBider(this);
    }

    @Override
    public void placeBid(int amount) {
        mediator.placeBid(this, amount);
    }

    @Override
    public void recieveBidNotification(int amount) {
        System.out.println(name + " received notification that bid amount is " + amount);
    }

    @Override
    public String getName() {
        return name;
    }
}
