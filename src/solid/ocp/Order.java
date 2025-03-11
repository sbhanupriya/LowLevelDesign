package solid.ocp;

public class Order {
    private Double amount;
    private  DiscountStrategy discountStrategy;
    public Order(Double amount, DiscountStrategy discountStrategy){
        this.amount = amount;
        this.discountStrategy = discountStrategy;
    }
    public double calculateDiscount(){
        return discountStrategy.calculateDiscount(amount);
    }

    public static  void main(String[] args){
        Order premiumOrder = new Order(100.0, new PremiumDiscount());
        Order regularOrder = new Order(100.0, new RegularDiscount());
        Order noDiscountOrder = new Order(100.0, new NoDiscount());

        System.out.println("Premium Order Discount: " + premiumOrder.calculateDiscount());
        System.out.println("Regular Order Discount: " + regularOrder.calculateDiscount());
        System.out.println("No Discount Order Discount: " + noDiscountOrder.calculateDiscount());

    }
}
