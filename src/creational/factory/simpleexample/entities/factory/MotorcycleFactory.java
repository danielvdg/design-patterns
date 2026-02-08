package creational.factory.simpleexample.entities.factory;

import creational.factory.simpleexample.entities.Motorcycle;
import creational.factory.simpleexample.interfac.Vehicle;

public class MotorcycleFactory extends VehicleFactory{


    @Override
    public Vehicle createVehicle(String model) {
        return new Motorcycle(model);
    }
}
