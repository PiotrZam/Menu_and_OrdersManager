package uk.ac.rgu.cm2100;
/*
 * Drink.java, created by Piotr Zambrzycki
 * Component 1 Part 1, 19-11-2021
 */

public class Drink implements IMenuItem{
    private String name;
    private int price;
    private boolean alcohol;

    public Drink(String name, int price, boolean alcohol) throws StringLengthException, OutOfBoundsException {
        if (price < 0 || price > 10000) {
            throw new OutOfBoundsException("Price value out of bounds");
        }
        this.price = price;

        if (name.length() == 0 || name.length() > 20) {
            throw new StringLengthException("Incorrect name");
        }
        this.name = name;
        this.alcohol = alcohol;
    }

    public int getPrice() {
        if(!this.alcohol) {
            return this.price;
        } else {
            return (this.price + 100);
        }
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        String description = this.name + ": " + this.price + "p";
        if(this.alcohol) {
            description += " (alcohol)";
        }
        return description;
    }

    public String toString() {
        return this.getDescription();
    }

    public String toCSV() {
        return "DRINK" + "," + this.name + "," + this.getPrice() + "," + this.alcohol + "\n";
    }
}
