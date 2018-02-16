package main;


public class Return {
    int price = 10, discount = 5;
    private int rate() {
        System.out.println("Inside rate() method ");
        return (price-discount);
    }
}
