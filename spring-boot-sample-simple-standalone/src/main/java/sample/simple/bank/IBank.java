package sample.simple.bank;

public interface IBank {
    void transfer(String senderAccountNumber, String receiverAccountNumber, double amount);
}
