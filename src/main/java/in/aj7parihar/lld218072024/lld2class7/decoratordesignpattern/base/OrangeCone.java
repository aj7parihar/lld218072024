package in.aj7parihar.lld218072024.lld2class7.decoratordesignpattern.base;

import in.aj7parihar.lld218072024.lld2class7.decoratordesignpattern.IceCream;

public class OrangeCone implements IceCream {

    @Override
    public Double getPrice() {
        return 20.0;
    }

    @Override
    public String getDescription() {
        return "Base is Orange Cone -> ";
    }
}
