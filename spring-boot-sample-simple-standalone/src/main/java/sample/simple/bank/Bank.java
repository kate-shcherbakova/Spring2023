package sample.simple.bank;

import org.springframework.stereotype.Component;

@Component
public class Bank implements IBank {

    @Override
    public void transfer(String senderAccountNumber, String receiverAccountNumber, double amount) {
        System.out.println("Transfer of " + amount + " from account " + senderAccountNumber +
                " to account " + receiverAccountNumber + " completed.");
    }
}
