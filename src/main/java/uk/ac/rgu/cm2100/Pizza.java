package uk.ac.rgu.cm2100;

import java.util.ArrayList;

/*
 * Pizza.java, created by Piotr Zambrzycki
 * Component 1 Part 1, 19-11-2021
 */

public class Pizza implements IMenuItem {
    private String name;
    private final int BASE_PRICE = 300;
    private Crust crust;
    private ArrayList<PizzaTopping> toppings;
    // Declared as an ArrayList rather than a Set because a customer might choose a double topping of the same kind rater than different ones, so in that case the collection elements would be repeated.


    public Pizza(String name, Crust crust) throws StringLengthException, OutOfBoundsException {
        if (name.length() == 0 || name.length() > 20) {
            throw new StringLengthException("Incorrect name");
        }
        this.name = name;
        this.crust = crust;
        this.toppings = new ArrayList<>();
   }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
       int thePrice = this.BASE_PRICE;
       for(PizzaTopping t : this.toppings) {
           thePrice += t.getPrice();
       }
        return thePrice;
    }

    public Crust getCrust() {
        return crust;
    }

    public void setCrust(Crust crust) {
        this.crust = crust;
    }

    public ArrayList<PizzaTopping> getToppings() {
        return toppings;
    }

    public void addToppings(PizzaTopping... theToppings) {
        for(PizzaTopping t : theToppings) {
            this.toppings.add(t);
        }
    }

    @Override
    public String getDescription() {
      String description = this.name + " " + this.getPrice() + "p " + this.crust.toString() + " " + this.toppings;
      return description;
    }

    public String toString() {
       return this.getName() + " " + this.getPrice() + "p";
    }

    public String toCSV() {
       return "PIZZA" + "," + this.name + "," + this.getPrice() + "," + this.toppings + "\n";
    }
}
