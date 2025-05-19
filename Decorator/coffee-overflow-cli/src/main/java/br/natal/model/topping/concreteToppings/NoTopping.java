package br.natal.model.topping.concreteToppings;

import br.natal.model.topping.AbstractTopping;

public class NoTopping implements AbstractTopping {

    @Override
    public String name() {
        return "";
    }

    @Override
    public double cost() {
        return 0;
    }
}
