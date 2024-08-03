package in.aj7parihar.lld218072024.lld2class7.decoratordesignpattern.pizzaassignment;

import in.aj7parihar.lld218072024.lld2class7.decoratordesignpattern.pizzaassignment.pizzas.BBQChicken;
import in.aj7parihar.lld218072024.lld2class7.decoratordesignpattern.pizzaassignment.toppingsdecorator.Cheese;
import in.aj7parihar.lld218072024.lld2class7.decoratordesignpattern.pizzaassignment.toppingsdecorator.Paneer;
import in.aj7parihar.lld218072024.lld2class7.decoratordesignpattern.pizzaassignment.toppingsdecorator.Tomato;

public class Client {
    public static void main(String[] args) {
        demoPizzaAssignment();
    }
    public static void demoPizzaAssignment() {
        Pizza  p = new Paneer(new Cheese(new Tomato(new BBQChicken())));

        // should output - 370.0
        System.out.println(p.getPrice());

        // should output - BBChicken + Tomato + Cheese + Paneer
        System.out.println(p.getDescription());
    }
}
