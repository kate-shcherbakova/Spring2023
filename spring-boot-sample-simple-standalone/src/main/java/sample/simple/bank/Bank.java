package sample.simple.bank;

import org.springframework.stereotype.Component;
import sample.simple.security.SecurityCheck;

@Component
public class Bank implements IBank {

    @SecurityCheck
    @Override
    public void transfer(String senderAccountNumber, String receiverAccountNumber, double amount) {
        System.out.println("Transfer of " + amount + " from account " + senderAccountNumber +
                " to account " + receiverAccountNumber + " completed.");
    }
}
