package in.aj7parihar.lld218072024.lld2class7.decoratordesignpattern.pizzaassignment.pizzas;

import in.aj7parihar.lld218072024.lld2class7.decoratordesignpattern.pizzaassignment.Pizza;

public class Pepperoni implements Pizza {

    @Override
    public double getPrice() {
        return 180.0;
    }

    @Override
    public String getDescription() {
        return "Pepperoni";
    }
}
