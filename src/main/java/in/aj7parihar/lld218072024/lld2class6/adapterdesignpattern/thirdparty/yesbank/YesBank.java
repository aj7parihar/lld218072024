package in.aj7parihar.lld218072024.lld2class6.adapterdesignpattern.thirdparty.yesbank;

public class YesBank implements YB{

    @Override
    public void transferMoney(double amount, String to, String from) {
        System.out.println("Made payment of amount " + amount + " to " + to + " from " + from
                + " *** Powered by PhonePe ***");
    }
}
