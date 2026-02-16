package designpatterns.behavioral.visitor;

import designpatterns.behavioral.visitor.element.DuplexRoom;
import designpatterns.behavioral.visitor.element.SingleRoom;

public interface Visitor {
    void visit(SingleRoom room);
    void visit(DuplexRoom room);
}
