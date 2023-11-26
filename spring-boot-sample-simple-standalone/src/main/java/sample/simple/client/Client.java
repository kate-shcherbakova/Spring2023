package sample.simple.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sample.simple.store.IFastLane;
import sample.simple.store.IJustHaveALook;
import sample.simple.store.ILane;

@Component
public class Client implements IRun {

    private final IFastLane fastLane;
    private final ILane lane;
    private final IJustHaveALook justHaveALook;

    @Autowired
    public Client(IFastLane fastLane, ILane lane, IJustHaveALook justHaveALook) {
        this.fastLane = fastLane;
        this.lane = lane;
        this.justHaveALook = justHaveALook;
    }

    @Override
    public void run() {
        System.out.println("Starting the application...");

        fastLane.oneShotOrder("Article1", 1, "54 rue Sainte-Anne, Rennes", "123456789");

        lane.addItemToCart("Article2", 3);
        lane.pay("10 rue Mirabeau, Rennes", "987654321");

        double price = justHaveALook.getPrice("Article3");
        System.out.println("The price of \"Article3\": " + price + ".");
        boolean available = justHaveALook.isAvailable("Article3", 12);
        System.out.println("The \"Article3\" is " + (available ? "available" : "not available") + ".");

    }
}
