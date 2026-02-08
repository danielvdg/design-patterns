package creational.factory.simpleexample.entities.factory;

import creational.factory.simpleexample.entities.Car;
import creational.factory.simpleexample.interfac.Vehicle;

public class CarFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle(String model) {
        return new Car(model);
    }
}
