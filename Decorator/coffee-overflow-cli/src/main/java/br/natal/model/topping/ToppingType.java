package br.natal.model.topping;

public enum ToppingType {
    Milk("Milk", 0.5),
    Sugar("Sugar", 0.10),
    WhippedCream("Whipped Cream", 0.5);

    public final String name;
    public final double cost;

    ToppingType(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
}
