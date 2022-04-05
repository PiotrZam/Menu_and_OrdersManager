package uk.ac.rgu.cm2100;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 * Order.java, created by Piotr Zambrzycki
 * Component 1 Part 1, 19-11-2021
 */

public class Order implements IOrder {
    private ArrayList<IMenuItem> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItem(IMenuItem item) {
        this.items.add(item);
    }

    public int total() {
        int totalCost = 0;
        for(IMenuItem item : this.items) {
            totalCost += item.getPrice();
        }
        return totalCost;
    }

    public void print() {
        for(IMenuItem item : this.items) {
            System.out.println(item.getName() + "  " + item.getPrice() + "p");
        }
        System.out.println(this.total() + "p");
    }

    public void writeToFile() {
        try(FileWriter fw = new FileWriter("orders.txt");
            BufferedWriter bw = new BufferedWriter(fw)){
            for(IMenuItem item : this.items) {
                bw.write(item.toCSV() + "\n");
            }
            bw.close();
            fw.close();
        }catch(IOException ex){
            System.out.println("An error occurred: " + ex.getMessage());
        }
    }

    public void sortByName() {
        try{
            Collections.sort(items);
        } catch(Exception ex) {
            System.out.println("An error occured " + ex.getMessage());
        }
    }

    public void sortByPrice() {
        try {
            IMenuItem.PriceComparator pComparator = new IMenuItem.PriceComparator();
            Collections.sort(this.items, pComparator);
        } catch(Exception ex) {
            System.out.println("An error occured: " + ex.getMessage());
        }
    }

    public void supply(SupplyMethod supplyMethod) {
        supplyMethod.setOrder(this);
        supplyMethod.supplyTheOrder();
    }
}
