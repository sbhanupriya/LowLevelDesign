package solid.ocp;

public class NoDiscount implements  DiscountStrategy{
    @Override
    public double calculateDiscount(double amount) {
        return 0;
    }
}
