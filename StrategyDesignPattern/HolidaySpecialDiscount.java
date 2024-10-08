package StrategyDesignPattern;

public class HolidaySpecialDiscount implements DiscountStrategy  {
    @Override
    public double applyDiscount(double amount) {
        return amount-amount*0.3;
    }
}
