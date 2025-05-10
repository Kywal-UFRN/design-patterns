package br.natal;

import br.natal.model.beverage.AbstractBeverage;
import br.natal.model.beverage.concreteBeverages.Espresso;
import br.natal.model.topping.Sugar;

public class Main {
    public static void main(String[] args) {

        AbstractBeverage espresso = new Espresso();
//        espresso.setToppings(new Sugar());

        System.out.println("Hello world!");


    }
}