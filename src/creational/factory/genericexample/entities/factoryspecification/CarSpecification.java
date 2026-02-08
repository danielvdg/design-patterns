package creational.factory.genericexample.entities.factoryspecification;

public class CarSpecification {
    private int numberOfDoors;
    private String fuelType;
    private int engineCapacity;

    public CarSpecification(int numberOfDoors, String fuelType, int engineCapacity) {
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Doors: " + numberOfDoors + ", Fuel: " + fuelType + ", Engine: " + engineCapacity + "cc";
    }
}
