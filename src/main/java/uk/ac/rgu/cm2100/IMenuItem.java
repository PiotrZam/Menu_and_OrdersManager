/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100;
import java.util.Comparator;
import java.util.Locale;

/**
 * @author mark
 * IMenuItem.java, edited by Piotr Zambrzycki
 * Component 1 Part 1, 19-11-2021
 */
public interface IMenuItem extends Comparable<IMenuItem> {
    
    public int getPrice();
    public String getDescription();
    public String getName();
    public String toCSV();

    @Override
    default int compareTo(IMenuItem otherItem) {
        return this.getName().toLowerCase().compareTo(otherItem.getName().toLowerCase());
    }

    public static class PriceComparator implements Comparator<IMenuItem> {
        public int compare(IMenuItem o1, IMenuItem o2) {
            return Integer.compare(o1.getPrice(), o2.getPrice());
        }
    }
}
