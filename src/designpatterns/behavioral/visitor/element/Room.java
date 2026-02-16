package designpatterns.behavioral.visitor.element;

import designpatterns.behavioral.visitor.Visitor;

public interface Room {
    void accept(Visitor visitor);
}
