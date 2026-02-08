package creational.factory.genericexample.entities.factory;

import creational.factory.genericexample.entities.Motorcycle;
import creational.factory.genericexample.entities.factoryspecification.MotorcycleSpecification;
import creational.factory.genericexample.interfac.Vehicle;

public class MotorcycleFactory extends VehicleFactory<Motorcycle, MotorcycleSpecification> {
    @Override
    public Vehicle<MotorcycleSpecification> createVehicle(String model, MotorcycleSpecification specification) {
        return new Motorcycle(model, specification);
    }
}
