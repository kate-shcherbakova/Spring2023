package sample.simple.store;

public interface ILane extends IStore {
    void addItemToCart(String articleReference, int quantity);
    void pay(String address, String accountNumber);
}
