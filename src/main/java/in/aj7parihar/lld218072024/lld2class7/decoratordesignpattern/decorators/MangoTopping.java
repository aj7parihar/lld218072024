package in.aj7parihar.lld218072024.lld2class7.decoratordesignpattern.decorators;

import in.aj7parihar.lld218072024.lld2class7.decoratordesignpattern.IceCream;

public class MangoTopping extends ToppingsDecorator{
    // this declaration of iceCream type is not needed here because it is already protected in superclass.
    // private final IceCream iceCream;

    public MangoTopping(IceCream iceCream){
        this.iceCream = iceCream;
        // super(iceCream);
    }

    @Override
    public Double getPrice(){
        // return super.getPrice()+ 140.0;
        return iceCream.getPrice() + 140.0;
    }

    @Override
    public String getDescription(){
//        return super.getDescription() + " Mango Topping -> ";
        return iceCream.getDescription() + " then MangoTopping -> ";
    }
}
