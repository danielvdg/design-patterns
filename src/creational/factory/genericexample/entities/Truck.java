package creational.factory.genericexample.entities;

import creational.factory.genericexample.entities.factoryspecification.TruckSpecification;
import creational.factory.genericexample.interfac.Vehicle;

public class Truck implements Vehicle<TruckSpecification> {
    private String model;
    private TruckSpecification specification;

    public Truck(String model, TruckSpecification specification) {
        this.model = model;
        this.specification = specification;
    }

    @Override
    public void start() {
        System.out.println("Truck " + model + " is starting");
    }

    @Override
    public void stop() {
        System.out.println("Truck " + model + " is stopping");
    }

    @Override
    public String getType() {
        return "Truck";
    }

    @Override
    public TruckSpecification getSpecification() {
        return specification;
    }
}