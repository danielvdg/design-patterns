package structural.strategy.simplestrategy.entities;

import structural.strategy.simplestrategy.inter.DrivingStrategy;

// Context - Classe que usa a estratégia
public class Vehicle {
    private String model;
    private DrivingStrategy drivingStrategy;

    public Vehicle(String model) {
        this.model = model;
    }

    // Método para definir a estratégia de direção
    public void setDrivingStrategy(DrivingStrategy drivingStrategy) {
        this.drivingStrategy = drivingStrategy;
    }

    // Método que delega a execução para a estratégia atual
    public void performDrive() {
        System.out.println(model + " is driving:");
        if (drivingStrategy != null) {
            drivingStrategy.drive();
        } else {
            System.out.println("No driving strategy set!");
        }
    }
}
