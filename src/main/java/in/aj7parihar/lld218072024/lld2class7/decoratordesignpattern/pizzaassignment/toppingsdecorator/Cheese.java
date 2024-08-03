package in.aj7parihar.lld218072024.lld2class7.decoratordesignpattern.pizzaassignment.toppingsdecorator;

import in.aj7parihar.lld218072024.lld2class7.decoratordesignpattern.pizzaassignment.Pizza;

public class Cheese extends Toppings {

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 80.0;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Cheese";
    }
}
