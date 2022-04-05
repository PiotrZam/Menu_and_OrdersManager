package uk.ac.rgu.cm2100;
/*
 * DeliverySupply.java, created by Piotr Zambrzycki
 * Component 1 Part 1, 19-11-2021
 */

public class DeliverySupply implements SupplyMethod {
    private Order theOrder;

    public void setOrder(Order order) {
        this.theOrder = order;
    }

    public void supplyTheOrder() {
        System.out.println("Delivered the order!");
    }
}
