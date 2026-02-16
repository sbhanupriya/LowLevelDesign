package designpatterns.behavioral.visitor.element;

import designpatterns.behavioral.visitor.Visitor;

public class DuplexRoom implements Room {
    private Double cost;

    public DuplexRoom(Double price){
        this.cost = price;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public Double getCost() {
        return cost;
    }
}
