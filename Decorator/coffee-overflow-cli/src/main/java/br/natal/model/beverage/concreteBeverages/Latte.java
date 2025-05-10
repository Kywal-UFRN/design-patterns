package br.natal.model.beverage.concreteBeverages;

import br.natal.model.beverage.Beverage;

public class Latte extends Beverage {

    @Override
    public String getDescription() {
        return BeverageType.LATTE.name;
    }

    @Override
    public double getCost() {
        return BeverageType.LATTE.price;
    }
}
