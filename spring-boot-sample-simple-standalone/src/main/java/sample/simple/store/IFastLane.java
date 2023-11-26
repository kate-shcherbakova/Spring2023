package sample.simple.store;

public interface IFastLane extends IStore {
    void oneShotOrder(String articleReference, int quantity, String address, String accountNumber);
}
