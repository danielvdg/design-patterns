package creational.factory.simpleexample.entities.factory;

import creational.factory.simpleexample.interfac.Vehicle;

public abstract class VehicleFactory {

    public abstract Vehicle createVehicle(String model);

    public void deliverVehicle(String model) {
        Vehicle vehicle = createVehicle(model);
        System.out.println("Delivering a " + vehicle.getType());
        vehicle.start();
        vehicle.stop();
    }
}
