package br.natal.model.beverage.concreteBeverages;

public enum BeverageType {

    // Espresso-Based Drinks
    ESPRESSO("Espresso", "A concentrated coffee brew made by forcing hot water through finely ground coffee beans.", 2.50),
    LATTE("Latte", "An espresso shot diluted with steamed milk and a thin layer of foam.", 3.50),
    CAPPUCCINO("Cappuccino", "An espresso shot with steamed milk and a thick layer of foam, often sprinkled with cocoa powder.", 3.75),
    MACCHIATO("Macchiato", "An espresso shot with a splash of steamed milk or foam.", 3.00),
    AMERICANO("Americano", "An espresso shot diluted with hot water.", 2.75),

    // Milk-Based Drinks
    CAFE_AU_LAIT("Cafe au Lait", "Equal parts hot coffee and steamed milk.", 3.25),
    CORTADO("Cortado", "A small, two-part drink with espresso and steamed milk, with a tiny bit of foam.", 3.00),
    FLAT_WHITE("Flat White", "An espresso shot with a generous amount of steamed milk and a smooth, velvety texture.", 3.50),
    MOCHA("Mocha", "A coffee drink that combines espresso, milk, and chocolate.", 4.00),

    // Other Coffee Drinks
    COLD_BREW("Cold Brew", "A coffee concentrate made by steeping coarsely ground coffee in cold water for an extended period.", 3.75),
    ICED_COFFEE("Iced Coffee", "A cold coffee drink made by brewing coffee with ice.", 3.25),
    IRISH_COFFEE("Irish Coffee", "A hot coffee drink with Irish whiskey, sugar, and whipped cream.", 5.00),
    AFFOGATO("Affogato", "A scoop of vanilla ice cream topped with a shot of hot espresso.", 4.50),
    RED_EYE("Red Eye", "A drink made by adding a shot of espresso to a cup of drip coffee.", 3.75),
    BLACK_EYE("Black Eye", "A drink made by adding a shot of espresso to a cup of coffee, often a French press.", 3.95);

    public final String name;
    public final String description;
    public final double price;

    BeverageType(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

}
