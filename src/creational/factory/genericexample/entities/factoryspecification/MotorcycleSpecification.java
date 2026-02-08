package creational.factory.genericexample.entities.factoryspecification;

public class MotorcycleSpecification {
    private String bikeType;
    private int engineCapacity;
    private boolean hasABS;

    public MotorcycleSpecification(String bikeType, int engineCapacity, boolean hasABS) {
        this.bikeType = bikeType;
        this.engineCapacity = engineCapacity;
        this.hasABS = hasABS;
    }

    @Override
    public String toString() {
        return "Type: " + bikeType + ", Engine: " + engineCapacity + "cc, ABS: " + hasABS;
    }
}
