package br.natal.model.topping.concreteToppings;

import br.natal.model.topping.AbstractTopping;
import br.natal.model.topping.ToppingWrapper;

public class Milk extends ToppingWrapper {

    public Milk(AbstractTopping topping) {
        super(topping);
    }

    public String name() {
        return topping.name() + ToppingType.Milk.name;
    }

    public double cost() {
        return topping.cost() + ToppingType.Milk.cost;
    }
}
