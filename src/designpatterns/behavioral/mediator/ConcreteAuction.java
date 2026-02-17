package designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAuction implements AuctionMediator {
    private List<Colleague> colleagueList;

    public ConcreteAuction(){
        colleagueList = new ArrayList<>();
    }
    @Override
    public void addBider(Colleague col) {
        colleagueList.add(col);
    }

    @Override
    public void placeBid(Colleague col, int amount) {
        System.out.println(col.getName() + " placed bid on " + amount);
        for(Colleague currColleage: colleagueList){
            if(!currColleage.equals(col)){
                currColleage.recieveBidNotification(amount);
            }
        }
    }
}
