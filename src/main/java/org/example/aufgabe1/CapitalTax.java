package org.example.aufgabe1;

public class CapitalTax extends Tax{
    public CapitalTax(int taxationYear) {
        super(taxationYear);
    }

    @Override
    public double calculateTax(double amount) {
        if (amount > 0) return amount * 0.3;
        return amount >= -10000 ? amount * 0.3 : amount * 0.3 + (amount + 10000) * 0.2;
    }
}
