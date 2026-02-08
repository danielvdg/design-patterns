package creational.factory.genericexample.entities;

import creational.factory.genericexample.entities.factoryspecification.CarSpecification;
import creational.factory.genericexample.interfac.Vehicle;

// Produto concreto 1 - Carro com especificações tipadas
public class Car implements Vehicle<CarSpecification> {
    private String model;
    private CarSpecification specification;

    public Car(String model, CarSpecification specification) {
        this.model = model;
        this.specification = specification;
    }

    @Override
    public void start() {
        System.out.println("Car " + model + " is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car " + model + " is stopping");
    }

    @Override
    public String getType() {
        return "Car";
    }

    @Override
    public CarSpecification getSpecification() {
        return specification;
    }
}
