package uk.ac.rgu.cm2100;
/*
 * PizzaTopping.java, created by Piotr Zambrzycki
 * Component 1 Part 1, 19-11-2021
 */

public class PizzaTopping {
    private String name;
    private int price;

    public PizzaTopping (String name, int price) throws StringLengthException, OutOfBoundsException{
        if (price < 0 || price > 10000) {
            throw new OutOfBoundsException("Price value out of bounds");
        }
        this.price = price;

        if (name.length() == 0 || name.length() > 20) {
            throw new StringLengthException("Incorrect name");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws StringLengthException {
        if (name.length() == 0 || name.length() > 20) {
            throw new StringLengthException("Incorrect name");
        }
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) throws OutOfBoundsException {
        if (price < 0 || price > 10000) {
            throw new OutOfBoundsException("Price value out of bounds");
        }
        this.price = price;
    }

    public String toString() {
        String description = "Topping: " + this.name;
        return description;
    }
}
