package designpatterns.behavioral.visitor;

import designpatterns.behavioral.visitor.element.DuplexRoom;
import designpatterns.behavioral.visitor.element.Room;
import designpatterns.behavioral.visitor.element.SingleRoom;

public class VisitorDemo {
    public static void main(String[] args){
        Visitor visitor = new RoomMaintainenaceVisitor();

        Room singleRoom = new SingleRoom(100.0);
        Room duplexRoom = new DuplexRoom(100.0);

        singleRoom.accept(visitor);
        duplexRoom.accept(visitor);

        Visitor priceCalcualationVisitor = new PriceCalcualationVisitor();
        singleRoom.accept(priceCalcualationVisitor);
        duplexRoom.accept(priceCalcualationVisitor);

    }
}
