package sample.simple.store;

public interface IJustHaveALook extends IStore {
    double getPrice(String articleReference);
    boolean isAvailable(String articleReference, int quantity);
}