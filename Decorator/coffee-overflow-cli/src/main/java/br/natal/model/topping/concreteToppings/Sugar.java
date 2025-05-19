package br.natal.model.topping.concreteToppings;

import br.natal.model.topping.AbstractTopping;
import br.natal.model.topping.ToppingWrapper;

public class Sugar extends ToppingWrapper {

    public Sugar(AbstractTopping topping) {
        super(topping);
    }

    public String name() {
        return topping.name() + ToppingType.Sugar.name;
    }

    public double cost() {
        return topping.cost() + ToppingType.Sugar.cost;
    }
}
