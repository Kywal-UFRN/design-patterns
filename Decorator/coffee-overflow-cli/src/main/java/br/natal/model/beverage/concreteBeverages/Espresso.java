package br.natal.model.beverage.concreteBeverages;

import br.natal.model.beverage.Beverage;
import br.natal.model.beverage.BeverageType;

public class Espresso extends Beverage {

    @Override
    public String getDescription() {
        return BeverageType.ESPRESSO.name;
    }

    @Override
    public double getCost() {
        return BeverageType.ESPRESSO.price;
    }
}
