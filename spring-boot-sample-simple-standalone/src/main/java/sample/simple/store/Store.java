package sample.simple.store;

import sample.simple.bank.IBank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sample.simple.provider.IProvider;

import java.util.Random;

@Component
public class Store implements ILane, IFastLane, IJustHaveALook {

    private final IBank bank;
    private final IProvider provider;

    @Autowired
    public Store(IBank bank, IProvider provider) {
        this.bank = bank;
        this.provider = provider;
    }

    @Override
    public double getPrice(String articleReference) {
        return provider.getPrice(articleReference);
    }

    @Override
    public boolean isAvailable(String articleReference, int quantity) {
        Random random = new Random();
        return random.nextBoolean(); // for test
    }

    @Override
    public void oneShotOrder(String articleReference, int quantity, String address, String customerAccountNumber) {
        System.out.println("1-scenario order for " + quantity + " items of " + articleReference +
                " to address: " + address + " for customer with account number: " + customerAccountNumber);
        bank.transfer(customerAccountNumber, "111111111", quantity * getPrice(articleReference));
    }

    @Override
    public void addItemToCart(String articleReference, int quantity) {
        System.out.println(quantity + " items of " + articleReference + " added to the cart.");
    }

    @Override
    public void pay(String address, String accountNumber) {
        System.out.println("Payment completed to address: " + address + " for customer with account number: " + accountNumber);
    }
}
