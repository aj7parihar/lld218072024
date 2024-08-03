package in.aj7parihar.lld218072024.lld2class7.decoratordesignpattern.pizzaassignment.toppingsdecorator;

import in.aj7parihar.lld218072024.lld2class7.decoratordesignpattern.pizzaassignment.Pizza;

public class Olive extends Toppings {

    public Olive(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 20.0;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Olive";
    }
}
