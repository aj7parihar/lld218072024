package in.aj7parihar.lld218072024.lld2class7.observerdesignpattern;

import in.aj7parihar.lld218072024.lld2class7.observerdesignpattern.publisher.Publisher;
import in.aj7parihar.lld218072024.lld2class7.observerdesignpattern.subscriber.Subscribers;

import java.util.ArrayList;
import java.util.List;

public class Amazon implements Publisher {

    List<Subscribers> subscribers = new ArrayList<Subscribers>();

    @Override
    public void subscribe(Subscribers subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscribers subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscribers subscriber : subscribers) {
            subscriber.update();
        }
    }

    public void orderPlaced(){
        System.out.println("Order has been placed");
        notifySubscribers();
    }
}
