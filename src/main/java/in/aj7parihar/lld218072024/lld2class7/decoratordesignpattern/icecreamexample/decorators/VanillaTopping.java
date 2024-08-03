package in.aj7parihar.lld218072024.lld2class7.decoratordesignpattern.icecreamexample.decorators;

import in.aj7parihar.lld218072024.lld2class7.decoratordesignpattern.icecreamexample.IceCream;

public class VanillaTopping extends ToppingsDecorator{
    // this declaration of iceCream type is not needed here because it is already protected in superclass.
    // private final IceCream iceCream;

    public VanillaTopping(IceCream iceCream) {
        // super(iceCream);
        this.iceCream = iceCream;
    }

    @Override
    public Double getPrice() {
        // return super.getPrice() + 50.0;
        return iceCream.getPrice() + 50.0;
    }

    @Override
    public String getDescription() {
        // return super.getDescription() + " Vanilla Topping -> ";
        return iceCream.getDescription() + " then VanillaTopping -> ";
    }
}
