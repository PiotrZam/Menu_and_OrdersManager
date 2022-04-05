package uk.ac.rgu.cm2100;
/*
 * Crust.java, created by Piotr Zambrzycki
 * Component 1 Part 1, 19-11-2021
 */

public enum Crust {
    ITALIANTHIN,
    HANDTOSSED,
    THICK,
    CHEESEBURST;

    public String toString() {
        return "Crust: " + this.name().toLowerCase();
    }
}
