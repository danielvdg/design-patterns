package creational.factory.genericexample.interfac;

public interface Vehicle<T> {
    void start();
    void stop();
    String getType();
    T getSpecification();
}
