package br.natal;

import br.natal.model.beverage.AbstractBeverage;
import br.natal.model.beverage.concreteBeverages.Espresso;
import br.natal.model.topping.concreteToppings.Milk;
import br.natal.model.topping.concreteToppings.Sugar;
import br.natal.model.topping.concreteToppings.WhippedCream;
import br.natal.view.CommandLineInterface;

public class Main {

    /**
     *  Basic usage example
     */
    public static void main(String[] args) {

//        AbstractBeverage espresso = new Espresso();
//        espresso.setToppings(new Sugar(new WhippedCream(new Milk())));
//
//        System.out.println("Espresso with:");
//        System.out.println(espresso.getToppings().name());

        CommandLineInterface cli = new CommandLineInterface();
        cli.exec();

    }
}