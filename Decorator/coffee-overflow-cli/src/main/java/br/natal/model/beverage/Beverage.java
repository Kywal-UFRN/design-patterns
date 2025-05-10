package br.natal.model.beverage;

import br.natal.model.topping.AbstractTopping;

public abstract class Beverage implements AbstractBeverage {

    protected AbstractTopping toppings;
    protected String description = "Unknown BeverageType";

    public String getDescription() {
        return description;
    }
}

