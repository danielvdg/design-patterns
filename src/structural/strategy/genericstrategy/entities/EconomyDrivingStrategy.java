package structural.strategy.genericstrategy.entities;

import structural.strategy.genericstrategy.inter.Strategy;

public class EconomyDrivingStrategy implements Strategy<PerformanceResult> {
    @Override
    public PerformanceResult execute() {
        System.out.println("Executing economy driving strategy");
        return new PerformanceResult(60, 5);
    }
}
