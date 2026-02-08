package creational.factory.genericexample;

import creational.factory.genericexample.entities.factory.CarFactory;
import creational.factory.genericexample.entities.factory.MotorcycleFactory;
import creational.factory.genericexample.entities.factory.TruckFactory;
import creational.factory.genericexample.entities.factoryspecification.CarSpecification;
import creational.factory.genericexample.entities.factoryspecification.MotorcycleSpecification;
import creational.factory.genericexample.entities.factoryspecification.TruckSpecification;

public class FactoryMethodGenericMain {
    public static void main(String[] args) {
        // Criando especificações para um carro
        CarSpecification carSpec = new CarSpecification(4, "Gasoline", 2000);
        // Criando fábrica de carros e produzindo um carro com especificações
        CarFactory carFactory = new CarFactory();
        carFactory.deliverVehicle("Toyota Corolla", carSpec);

        System.out.println("\n---\n");

        // Criando especificações para uma moto
        MotorcycleSpecification motoSpec = new MotorcycleSpecification("Sport", 1000, true);
        // Criando fábrica de motos e produzindo uma moto com especificações
        MotorcycleFactory motorcycleFactory = new MotorcycleFactory();
        motorcycleFactory.deliverVehicle("Kawasaki Ninja", motoSpec);

        System.out.println("\n---\n");

        // Criando especificações para um caminhão
        TruckSpecification truckSpec = new TruckSpecification(25.5, 6, "Automatic");
        // Criando fábrica de caminhões e produzindo um caminhão com especificações
        TruckFactory truckFactory = new TruckFactory();
        truckFactory.deliverVehicle("Scania R500", truckSpec);
    }
}
