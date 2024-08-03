package in.aj7parihar.lld218072024.lld2class7.decoratordesignpattern.pizzaassignment.pizzas;

import in.aj7parihar.lld218072024.lld2class7.decoratordesignpattern.pizzaassignment.Pizza;

public class Margherita implements Pizza {

    @Override
    public double getPrice() {
        return 200.0;
    }

    @Override
    public String getDescription() {
        return "Margherita";
    }
}
