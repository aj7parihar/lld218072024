package in.aj7parihar.lld218072024.lld2class6.adapterdesignpattern;

public interface BankApi {
    void sendMoney(String from, String to, double amount);
    void registerUser(String accountNumber);
    void checkBalance(String accountNumber);
}
