package designpatterns.behavioral.visitor.element;

import designpatterns.behavioral.visitor.Visitor;

public class SingleRoom implements Room{

    private Double price;

    public SingleRoom(Double cost){
        this.price = cost;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public Double getPrice() {
        return price;
    }
}
