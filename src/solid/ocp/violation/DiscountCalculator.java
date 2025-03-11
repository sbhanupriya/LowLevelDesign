package solid.ocp.violation;

public class DiscountCalculator {
    public double calculateDiscount(Order order) {
        if (order.getType().equals("Premium")) {
            return order.getAmount() * 0.2;
        } else if (order.getType().equals("Regular")) {
            return order.getAmount() * 0.1;
        }
        return 0;
    }
}
