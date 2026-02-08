package creational.factory.genericexample.entities.factory;

import creational.factory.genericexample.entities.Car;
import creational.factory.genericexample.entities.factoryspecification.CarSpecification;
import creational.factory.genericexample.interfac.Vehicle;

public class CarFactory extends VehicleFactory<Car, CarSpecification> {
    @Override
    public Vehicle<CarSpecification> createVehicle(String model, CarSpecification specification) {
        return new Car(model, specification);
    }
}
