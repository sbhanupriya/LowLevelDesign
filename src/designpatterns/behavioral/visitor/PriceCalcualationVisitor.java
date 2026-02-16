package designpatterns.behavioral.visitor;

import designpatterns.behavioral.visitor.element.DuplexRoom;
import designpatterns.behavioral.visitor.element.SingleRoom;

public class PriceCalcualationVisitor implements Visitor{
    @Override
    public void visit(SingleRoom room) {
        Double finalCost = room.getPrice() +0.01* room.getPrice();
        System.out.println("Calucating Price Operation for Single Room " + finalCost);
    }

    @Override
    public void visit(DuplexRoom room) {
        Double finalCost = room.getCost() + 0.05* room.getCost();
        System.out.println("Calucating Price Operation for Duplex Room " + finalCost);
    }
}
