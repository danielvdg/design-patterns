package creational.factory;

import creational.factory.simpleexample.entities.factory.CarFactory;
import creational.factory.simpleexample.entities.factory.MotorcycleFactory;
import creational.factory.simpleexample.entities.factory.TruckFactory;
import creational.factory.simpleexample.entities.factory.VehicleFactory;

public class FactoryMethodMain {
    public static void main(String[] args) {
        // Criando fábrica de carros e produzindo um carro
        VehicleFactory carFactory = new CarFactory();
        carFactory.deliverVehicle("Honda Civic");

        System.out.println("\n---\n");

        // Criando fábrica de motos e produzindo uma moto
        VehicleFactory motorcycleFactory = new MotorcycleFactory();
        motorcycleFactory.deliverVehicle("Yamaha R1");

        System.out.println("\n---\n");

        // Criando fábrica de caminhões e produzindo um caminhão
        VehicleFactory truckFactory = new TruckFactory();
        truckFactory.deliverVehicle("Volvo FH16");
    }
}