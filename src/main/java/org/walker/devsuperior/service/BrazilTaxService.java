package org.walker.devsuperior.service;

public class BrazilTaxService extends TaxService{
    @Override
    public double tax(double amount) { //tax=imposto; amount=quantia
        return amount * 0.3;
    }
}
