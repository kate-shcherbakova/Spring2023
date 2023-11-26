package sample.simple.provider;

public interface IProvider {
    double getPrice(String articleReference);

    void order(String articleReference, int quantity);
}
