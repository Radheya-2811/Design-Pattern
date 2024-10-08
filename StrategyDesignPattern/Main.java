package StrategyDesignPattern;

public class Main {
    public static void main(String[] args) {
       DiscountStrategy reulStrategy=new RegularDiscount();
       ShoppingCart sc=new ShoppingCart(reulStrategy);
       sc.calculateTotal(6000);

    }
}
