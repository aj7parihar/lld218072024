package in.aj7parihar.lld218072024.lld2class7.observerdesignpattern;

import in.aj7parihar.lld218072024.lld2class7.observerdesignpattern.subscriber.EmailService;
import in.aj7parihar.lld218072024.lld2class7.observerdesignpattern.subscriber.InventoryService;
import in.aj7parihar.lld218072024.lld2class7.observerdesignpattern.subscriber.LogisticsService;
import in.aj7parihar.lld218072024.lld2class7.observerdesignpattern.subscriber.SmsService;

public class Client {
    public static void main(String[] args) {
        demoObserverDesignPattern();
    }
    public static void demoObserverDesignPattern() {
        Amazon amazon = new Amazon();

        SmsService smsService = new SmsService();
        EmailService emailService = new EmailService();
        InventoryService inventoryService = new InventoryService();
        LogisticsService logisticsService = new LogisticsService();

        amazon.subscribe(smsService);
        amazon.subscribe(emailService);
        amazon.subscribe(inventoryService);
        amazon.subscribe(logisticsService);

        // notifying subscribers
        amazon.orderPlaced();
    }
}
