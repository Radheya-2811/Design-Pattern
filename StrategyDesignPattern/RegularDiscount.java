package StrategyDesignPattern;

public class RegularDiscount implements DiscountStrategy{
    @Override
    public double applyDiscount(double amount) {
        return amount-amount*0.1;
    }
}
