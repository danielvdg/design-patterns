package structural.strategy.simplestrategy.entities;

import structural.strategy.simplestrategy.inter.DrivingStrategy;

public class EconomyDriving implements DrivingStrategy {
    @Override
    public void drive() {
        System.out.println("Driving in economy mode: saving fuel");
    }
}
