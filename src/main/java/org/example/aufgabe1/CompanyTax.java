package org.example.aufgabe1;

public class CompanyTax extends Tax {

    public CompanyTax(int taxationYear) {
        super(taxationYear);
    }

    @Override
    public double calculateTax(double amount) {
        return amount * 0.19 + amount * 0.3;
    }
}
