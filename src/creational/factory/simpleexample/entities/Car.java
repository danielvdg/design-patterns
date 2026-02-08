package creational.factory.simpleexample.entities;

import creational.factory.simpleexample.interfac.Vehicle;

public class Car implements Vehicle {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println("Car " + model + " is starting with ignition key");
    }

    @Override
    public void stop() {
        System.out.println("Car " + model + " is stopping");
    }

    @Override
    public String getType() {
        return "Car";
    }
}
