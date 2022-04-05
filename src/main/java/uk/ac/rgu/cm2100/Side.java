package uk.ac.rgu.cm2100;
/*
 * Side.java, created by Piotr Zambrzycki
 * Component 1 Part 1, 19-11-2021
 */

public class Side implements IMenuItem{
    private String name;
    private int price;

    public Side(String name, int price) throws StringLengthException, OutOfBoundsException {
        if (price < 0 || price > 10000) {
            throw new OutOfBoundsException("Price value out of bounds");
        }
        this.price = price;

        if (name.length() == 0 || name.length() > 20) {
            throw new StringLengthException("Incorrect name");
        }
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    public String getDescription() {
        return this.name + ": " + this.price + "p";
    }

    public String toString() {
        return this.getDescription();
    }

    public String toCSV() {
        return "SIDE" + "," + this.name + "," + this.price + "\n";
    }
}
