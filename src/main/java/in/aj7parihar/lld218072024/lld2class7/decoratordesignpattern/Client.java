package in.aj7parihar.lld218072024.lld2class7.decoratordesignpattern;

import in.aj7parihar.lld218072024.lld2class7.decoratordesignpattern.base.OrangeCone;
import in.aj7parihar.lld218072024.lld2class7.decoratordesignpattern.decorators.Cherry;
import in.aj7parihar.lld218072024.lld2class7.decoratordesignpattern.decorators.StrawberryTopping;

public class Client {
    public static void main(String[] args) {
        demoDecoratorDesignPattern();
    }
    public static void demoDecoratorDesignPattern() {

        // Choose the base first
        IceCream iceCream = new OrangeCone();

        // Add the toppings
        iceCream = new StrawberryTopping(iceCream);
        // iceCream = new VanillaTopping(iceCream);
        // iceCream = new MangoTopping(iceCream);
        iceCream = new Cherry(iceCream);

        System.out.println(iceCream.getDescription());
        System.out.println("Total price would be " + iceCream.getPrice());
    }
}
