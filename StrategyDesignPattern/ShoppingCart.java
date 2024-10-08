package StrategyDesignPattern;

public class ShoppingCart {
    DiscountStrategy ds;
    ShoppingCart(DiscountStrategy ds){
        this.ds=ds;
    }
    void setStrategy(DiscountStrategy ds){
        this.ds=ds;
    }
    double calculateTotal(double amount){
        return ds.applyDiscount(amount);
    }
}
