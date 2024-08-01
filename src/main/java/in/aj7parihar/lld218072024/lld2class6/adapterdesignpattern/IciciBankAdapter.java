package in.aj7parihar.lld218072024.lld2class6.adapterdesignpattern;

import in.aj7parihar.lld218072024.lld2class6.adapterdesignpattern.thirdparty.icicibank.Icici;
import in.aj7parihar.lld218072024.lld2class6.adapterdesignpattern.thirdparty.icicibank.IciciBank;

public class IciciBankAdapter implements BankApi{
    private Icici icici = new IciciBank();

//    public IciciBankAdapter(Icici icici) {
//        this.icici = icici;
//    }

    @Override
    public void sendMoney(String from, String to, double amount) {
        icici.makePayment(amount, to, from);
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
