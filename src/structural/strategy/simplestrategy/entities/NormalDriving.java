package structural.strategy.simplestrategy.entities;

import structural.strategy.simplestrategy.inter.DrivingStrategy;

public class NormalDriving implements DrivingStrategy {
    @Override
    public void drive() {
        System.out.println("Driving normally at moderate speed");
    }
}
