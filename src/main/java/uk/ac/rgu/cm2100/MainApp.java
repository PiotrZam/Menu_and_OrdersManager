/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100;

/**
 *
 * @author mark
 * MainApp.java, edited by Piotr Zambrzycki
 * Component 1 Part 1, 19-11-2021
 */
public class MainApp {
    
    public static void main(String[] args){
        try {
            Crust a = Crust.THICK;
            Crust b = Crust.CHEESEBURST;

            PizzaTopping aTopping = new PizzaTopping("chicken", 100);
            PizzaTopping bTopping = new PizzaTopping("tomatoes", 50);
            PizzaTopping cTopping = new PizzaTopping("cheese", 50);
            PizzaTopping dTopping = new PizzaTopping("pineapple", 50);
            PizzaTopping eTopping = new PizzaTopping("tuna", 100);

            Pizza aPizza = new Pizza("Margarita", a);
            aPizza.addToppings(aTopping, cTopping);
            Pizza bPizza = new Pizza("Tropicana", b);
            bPizza.addToppings(bTopping, cTopping, dTopping);
            Pizza cPizza = new Pizza("Tuna Pizza", b);
            cPizza.addToppings(bTopping, cTopping, eTopping);


            Side aSide = new Side("chips", 300);
            Side bSide = new Side("potato fries", 350);
            Side cSide = new Side("fried bread", 250);

            Drink aDrink = new Drink("cola", 150, false);
            Drink bDrink = new Drink("water", 100, false);
            Drink cDrink = new Drink("beer", 300, true);
            Drink dDrink = new Drink("wine", 350, true);

            System.out.println(aPizza.getName());
            System.out.println(aPizza.getPrice());
            System.out.println(aPizza.getCrust());
            System.out.println(aPizza.getToppings());
            System.out.println(aPizza.toString());
            System.out.println(aPizza.getDescription());

            System.out.println(aDrink.getName());
            System.out.println(aDrink.getPrice());
            System.out.println(aDrink.getDescription());
            System.out.println(aDrink.getClass());
            System.out.println(aDrink.toString());
            aDrink.toCSV();

            System.out.println(aSide.getName());
            System.out.println(aSide.getPrice());
            System.out.println(aSide.getDescription());
            System.out.println(aSide.toString());

            System.out.println(aTopping.getName());
            System.out.println(aTopping.getPrice());
            System.out.println(aTopping.toString());


            Order aOrder = new Order();
            aOrder.addItem(aPizza);
            aOrder.addItem(bDrink);
            aOrder.addItem(dDrink);
            aOrder.addItem(bSide);
            aOrder.addItem(cSide);

            System.out.println(aOrder.total());
            aOrder.print();
            System.out.println("-----------");
            aOrder.sortByName();
            aOrder.print();
            System.out.println("-----------");
            aOrder.sortByPrice();
            aOrder.print();
            aOrder.writeToFile();

            aOrder.supply(new CollectionSupply());

        } catch (OutOfBoundsException ex) {
            System.out.println("The price needs to be in the range of 0-10000");
        } catch (StringLengthException ex) {
            System.out.println("The name needs to consist of 1-20 characters");
        } catch (Exception ex) {
            System.out.println("An error occured: " + ex.getMessage());
        }
    }


}
