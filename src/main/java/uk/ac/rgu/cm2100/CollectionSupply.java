package uk.ac.rgu.cm2100;

/*
 * CollectionSupply.java, created by Piotr Zambrzycki
 * Component 1 Part 1, 19-11-2021
 */

public class CollectionSupply implements SupplyMethod {
    private Order theOrder;

    @Override
    public void setOrder(Order order) {
        this.theOrder = order;
    }

    public void supplyTheOrder() {
        System.out.println("The order will be collected by the customer!");
    }
}
