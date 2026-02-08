package creational.factory.genericexample.entities.factory;

import creational.factory.genericexample.interfac.Vehicle;

public abstract class VehicleFactory<T, S> {
    // Factory Method genérico - retorna um veículo do tipo específico
    public abstract Vehicle<S> createVehicle(String model, S specification);

    // Método que usa o factory method e trabalha com o tipo genérico
    public void deliverVehicle(String model, S specification) {
        Vehicle<S> vehicle = createVehicle(model, specification);
        System.out.println("Delivering a " + vehicle.getType());
        System.out.println("Specifications: " + vehicle.getSpecification());
        vehicle.start();
        vehicle.stop();
    }
}
