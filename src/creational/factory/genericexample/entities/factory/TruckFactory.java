package creational.factory.genericexample.entities.factory;

import creational.factory.genericexample.entities.Truck;
import creational.factory.genericexample.entities.factoryspecification.TruckSpecification;
import creational.factory.genericexample.interfac.Vehicle;

public class TruckFactory extends VehicleFactory<Truck, TruckSpecification> {
    @Override
    public Vehicle<TruckSpecification> createVehicle(String model, TruckSpecification specification) {
        return new Truck(model, specification);
    }
}
