package in.aj7parihar.lld218072024.lld2class6.adapterdesignpattern;

import in.aj7parihar.lld218072024.lld2class6.adapterdesignpattern.thirdparty.yesbank.YB;
import in.aj7parihar.lld218072024.lld2class6.adapterdesignpattern.thirdparty.yesbank.YesBank;

public class YesBankAdapter implements BankApi{

    private final YB yb = new YesBank();

//    public YesBankAdapter(YB yb) {
//        this.yb = yb;
//    }

    @Override
    public void sendMoney(String from, String to, double amount) {
        yb.transferMoney(amount, to, from);
    }

    @Override
    public void registerUser(String accountNumber) {
        System.out.println("Do nothing for now");
    }

    @Override
    public void checkBalance(String accountNumber) {
        System.out.println("Do nothing for now");
    }
}
