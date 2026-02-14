package designpatterns.behavioral.memento;

public class OrderDemo {
    public static void main(String[] args) {
        Order order = new Order(new OrderState(100.0, "BOOKED"));


        History history = new History();
        history.track(order.save());

        order.setState(new OrderState(100 + 20.0, "PAID"));
        history.track(order.save());

        order.setState(new OrderState(100 + 20.0, "SHIPPED"));

        order.invoice();
        order.restore(history.undo());
        order.invoice();
    }
}
