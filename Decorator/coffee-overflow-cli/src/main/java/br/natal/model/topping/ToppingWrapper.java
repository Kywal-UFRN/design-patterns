package br.natal.model.topping;

public abstract class ToppingWrapper implements AbstractTopping {
    protected AbstractTopping topping;

    public ToppingWrapper(AbstractTopping topping) {
        this.topping = topping;
    }
}
