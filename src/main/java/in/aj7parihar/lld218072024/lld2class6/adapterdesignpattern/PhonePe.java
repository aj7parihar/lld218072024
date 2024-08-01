package in.aj7parihar.lld218072024.lld2class6.adapterdesignpattern;

public class PhonePe {
    // private BankApi bankApi = new IciciBankAdapter();
    private BankApi bankApi = new YesBankAdapter();

//    public PhonePe(BankApi bankApi) {
//        this.bankApi = bankApi;
//    }
    
    public void sendMoney(String from, String to, double amount){
        bankApi.sendMoney(from, to, amount);
    }
}
