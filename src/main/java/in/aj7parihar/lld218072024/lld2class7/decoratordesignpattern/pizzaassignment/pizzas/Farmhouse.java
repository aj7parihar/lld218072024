package in.aj7parihar.lld218072024.lld2class7.decoratordesignpattern.pizzaassignment.pizzas;

import in.aj7parihar.lld218072024.lld2class7.decoratordesignpattern.pizzaassignment.Pizza;

public class Farmhouse implements Pizza {

    @Override
    public double getPrice() {
        return 150.0;
    }

    @Override
    public String getDescription() {
        return "Farmhouse";
    }
}
