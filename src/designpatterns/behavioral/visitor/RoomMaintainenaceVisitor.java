package designpatterns.behavioral.visitor;

import designpatterns.behavioral.visitor.element.DuplexRoom;
import designpatterns.behavioral.visitor.element.SingleRoom;

public class RoomMaintainenaceVisitor implements Visitor{
    @Override
    public void visit(SingleRoom room) {
        System.out.println("Running maintenance for Single Room");
    }

    @Override
    public void visit(DuplexRoom room) {
        System.out.println("Running maintenance for Duplex Room");
    }
}
