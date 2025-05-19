package br.natal.model.topping;

import br.natal.model.topping.concreteToppings.NoTopping;

public abstract class ToppingWrapper implements AbstractTopping {
    protected AbstractTopping topping;

    public ToppingWrapper() {
        this.topping = new NoTopping();
    }

    public ToppingWrapper(AbstractTopping topping) {
        this.topping = topping;
    }
}
