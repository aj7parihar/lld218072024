package in.aj7parihar.lld218072024.lld2class4.abstractfactorydesignpattern.components.button;

public class IOSButton implements Button {

    @Override
    public void clickButton() {
        System.out.println("IOS Button clicked");
    }
}
