package solid.ocp.violation;

public class Order {
    private Double amount;
    private String type;
    public Order(Double amount, String type){
        this.amount = amount;
        this.type = type;
    }
    public Double getAmount(){
        return amount;
    }
    public String getType(){
        return type;
    }
}
