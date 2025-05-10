package br.natal.model.beverage;

import br.natal.model.topping.AbstractTopping;

public interface AbstractBeverage {
    String getDescription();
    double getCost();

    void setToppings(AbstractTopping toppings);
    AbstractTopping getToppings();
}
