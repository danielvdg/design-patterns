package creational.factory.genericexample.entities.factoryspecification;

public class TruckSpecification {
    private double loadCapacity;
    private int numberOfAxles;
    private String transmissionType;

    public TruckSpecification(double loadCapacity, int numberOfAxles, String transmissionType) {
        this.loadCapacity = loadCapacity;
        this.numberOfAxles = numberOfAxles;
        this.transmissionType = transmissionType;
    }

    @Override
    public String toString() {
        return "Load: " + loadCapacity + "t, Axles: " + numberOfAxles + ", Transmission: " + transmissionType;
    }
}