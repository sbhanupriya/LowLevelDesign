package designpatterns.behavioral.memento;

public class OrderState {
    private final Double amount;
    private final String status;
    public Double getAmount(){
        return amount;
    }
    public String getStatus(){
        return status;
    }
    public OrderState(Double amount, String status){
        this.amount = amount;
        this.status = status;
    }
}
