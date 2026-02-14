package designpatterns.behavioral.memento;

public class Order {
    private OrderState state;
    public Order(OrderState state){
        this.state = state;
    }
    public void setState(OrderState state){
        this.state = state;
    }
    public Memento save(){
        OrderState state1 = new OrderState(state.getAmount(), state.getStatus());
        return new Memento(state1);
    }
    public void restore(Memento memento){
        this.state = memento.state;
    }
    public static class Memento{
        private final OrderState state;
        private Memento(OrderState state){
            this.state = state;
        }
    }

    public void invoice(){
        System.out.println(this.state.getAmount()+ "......." + this.state.getStatus());
    }
}


