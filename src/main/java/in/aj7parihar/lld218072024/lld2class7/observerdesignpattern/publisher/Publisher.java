package in.aj7parihar.lld218072024.lld2class7.observerdesignpattern.publisher;

import in.aj7parihar.lld218072024.lld2class7.observerdesignpattern.subscriber.Subscribers;

public interface Publisher {
    void subscribe(Subscribers subscriber);
    void unsubscribe(Subscribers subscriber);
    void notifySubscribers();
}
