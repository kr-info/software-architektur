package org.example.aufgabe1;

public abstract class Tax {

    private int taxationYear;

    public Tax(int taxationYear) {
        this.taxationYear = taxationYear;
    }

    public int getTaxationYear() {
        return taxationYear;
    }

    public abstract double calculateTax(double amount);

}
