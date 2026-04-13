package org.example.aufgabe1;

public class IncomeTax extends Tax{
    public IncomeTax(int taxationYear) {
        super(taxationYear);
    }

    @Override
    public double calculateTax(double amount) {
        return amount * 0.33 + (amount-33.000) * 0.2;
    }
}
