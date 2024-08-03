package in.aj7parihar.lld218072024.lld2class7.decoratordesignpattern.decorators;

import in.aj7parihar.lld218072024.lld2class7.decoratordesignpattern.IceCream;

public class StrawberryTopping extends ToppingsDecorator{
    // this declaration of iceCream type is not needed here because it is already protected in superclass.
    // private final IceCream iceCream;

    public StrawberryTopping(IceCream iceCream){
        // super(iceCream);
        this.iceCream = iceCream;
    }

    @Override
    public Double getPrice(){
        // return super.getPrice()+ 120.0;
        return iceCream.getPrice() + 120.0;
    }

    @Override
    public String getDescription(){
        // return super.getDescription()+ " Strawberry Topping -> ";
        return iceCream.getDescription() + " then StrawberryTopping -> ";
    }
}
