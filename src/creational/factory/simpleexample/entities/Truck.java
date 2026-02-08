package creational.factory.simpleexample.entities;

import creational.factory.simpleexample.interfac.Vehicle;

public class Truck implements Vehicle {
    private String model;

    public Truck(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println("Truck " + model + " is starting with diesel engine");
    }

    @Override
    public void stop() {
        System.out.println("Truck " + model + " is stopping");
    }

    @Override
    public String getType() {
        return "Truck";
    }
}
