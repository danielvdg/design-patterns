package creational.factory.simpleexample.entities.factory;

import creational.factory.simpleexample.entities.Truck;
import creational.factory.simpleexample.interfac.Vehicle;

public class TruckFactory extends VehicleFactory{

    @Override
    public Vehicle createVehicle(String model) {
        return new Truck(model);
    }
}
