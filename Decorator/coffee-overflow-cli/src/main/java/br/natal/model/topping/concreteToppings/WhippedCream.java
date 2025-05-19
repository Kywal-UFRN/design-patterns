package br.natal.model.topping.concreteToppings;

import br.natal.model.topping.AbstractTopping;
import br.natal.model.topping.ToppingType;
import br.natal.model.topping.ToppingWrapper;
import br.natal.utils.StringSeparator;

public class WhippedCream extends ToppingWrapper {

    public WhippedCream() {
        super();
    }

    public WhippedCream(AbstractTopping topping) {
        super(topping);
    }

    public String name() {
        return topping.name() + StringSeparator.BASIC.begin + ToppingType.WhippedCream.name + StringSeparator.BASIC.end;
    }

    public double cost() {
        return topping.cost() + ToppingType.WhippedCream.cost;
    }
}
