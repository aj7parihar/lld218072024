package in.aj7parihar.lld218072024.lld2class7.decoratordesignpattern.decorators;

import in.aj7parihar.lld218072024.lld2class7.decoratordesignpattern.IceCream;

public abstract class ToppingsDecorator implements IceCream {

    protected IceCream iceCream;

//    public ToppingsDecorator(IceCream iceCream) {
//        this.iceCream = iceCream;
//    }
//
//    @Override
//    public Double getPrice() {
//        return iceCream.getPrice();
//    }
//
//    @Override
//    public String getDescription() {
//        return iceCream.getDescription();
//    }
}
