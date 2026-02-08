package creational.factory.simpleexample.entities;

import creational.factory.simpleexample.interfac.Vehicle;

public class Motorcycle implements Vehicle {
    private String model;

    public Motorcycle(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println("Motorcycle " + model + " is starting with kick start");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle " + model + " is stopping");
    }

    @Override
    public String getType() {
        return "Motorcycle";
    }
}
