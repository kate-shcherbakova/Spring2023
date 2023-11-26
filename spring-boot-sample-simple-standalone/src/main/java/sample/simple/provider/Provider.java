package sample.simple.provider;

import org.springframework.stereotype.Component;

@Component
public class Provider implements IProvider {

    @Override
    public double getPrice(String articleReference) {
        return 33.99; // for test
    }

    @Override
    public void order(String articleReference, int quantity) {
        System.out.println("Ordered " + quantity + " of article " + articleReference);
    }
}
