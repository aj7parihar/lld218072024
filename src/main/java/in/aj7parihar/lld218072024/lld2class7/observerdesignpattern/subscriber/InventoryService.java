package in.aj7parihar.lld218072024.lld2class7.observerdesignpattern.subscriber;

public class InventoryService implements Subscribers{

    @Override
    public void update() {
        System.out.println("Inventory has been updated");
    }
}
