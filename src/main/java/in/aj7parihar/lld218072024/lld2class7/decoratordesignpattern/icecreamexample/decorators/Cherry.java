package in.aj7parihar.lld218072024.lld2class7.decoratordesignpattern.icecreamexample.decorators;

import in.aj7parihar.lld218072024.lld2class7.decoratordesignpattern.icecreamexample.IceCream;

public class Cherry extends ToppingsDecorator{
    // this declaration of iceCream type is not needed here because it is already protected in superclass.
    // private final IceCream iceCream;

    public Cherry(IceCream iceCream){
        // super(iceCream);
        this.iceCream = iceCream;
    }

    @Override
    public Double getPrice(){
//        return super.getPrice()+ 10.0;
        return iceCream.getPrice() + 10.0;
    }

    @Override
    public String getDescription() {
//        return super.getDescription() + " -> Cherry on top";
        return iceCream.getDescription() + " finally Cherry on top.";
    }
}
