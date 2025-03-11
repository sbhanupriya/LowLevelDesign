package solid.ocp;

public class PremiumDiscount implements DiscountStrategy{
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.5;
    }
}
