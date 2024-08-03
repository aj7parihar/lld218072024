package in.aj7parihar.lld218072024.lld2class7.observerdesignpattern.subscriber;

public class EmailService implements Subscribers{

    @Override
    public void update() {
        System.out.println("Email has been sent");
    }
}
