package in.aj7parihar.lld218072024.lld2class6.adapterdesignpattern;

public class Client {
    public static void main(String[] args) {
        demoAdapterDesignPattern();
    }
    public static void demoAdapterDesignPattern() {
        // BankApi bankApi = new YesBankAdapter();
        // Tomorrow let's we have to change the business bank then just switch the adapter

//        BankApi bankApi = new IciciBankAdapter();

        // Why to expose it to the client, better to do the way we did in project module

        PhonePe phonePe = new PhonePe();

        String from = "Ajay";
        String to = "Shivani";
        double amount = 101.00;

        phonePe.sendMoney(from, to, amount);
        System.out.println("DEBUG");
    }
}
