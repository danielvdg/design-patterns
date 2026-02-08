package creational.factory.genericexample.entities;

import creational.factory.genericexample.entities.factoryspecification.MotorcycleSpecification;
import creational.factory.genericexample.interfac.Vehicle;

public class Motorcycle implements Vehicle<MotorcycleSpecification> {
    private String model;
    private MotorcycleSpecification specification;

    public Motorcycle(String model, MotorcycleSpecification specification) {
        this.model = model;
        this.specification = specification;
    }

    @Override
    public void start() {
        System.out.println("Motorcycle " + model + " is starting");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle " + model + " is stopping");
    }

    @Override
    public String getType() {
        return "Motorcycle";
    }

    @Override
    public MotorcycleSpecification getSpecification() {
        return specification;
    }
}
