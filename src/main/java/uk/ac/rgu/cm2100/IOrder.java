/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100;

/**
 *
 * @author mark
 * Iorder.java, edited by Piotr Zambrzycki
 * Component 1 Part 1, 19-11-2021
 */
public interface IOrder {
    
    public void addItem(IMenuItem item);
    
    public int total();
    
    public void print();
    
    public void writeToFile();

    public void sortByName();

    public void sortByPrice();

    public void supply(SupplyMethod supplyMethod);
}
