package StrategyDesignPattern;

public class PremiumDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount-amount*0.2;
    }
}
