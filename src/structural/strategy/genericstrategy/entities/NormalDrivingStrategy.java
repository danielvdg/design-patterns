package structural.strategy.genericstrategy.entities;

import structural.strategy.genericstrategy.inter.Strategy;

public class NormalDrivingStrategy implements Strategy<PerformanceResult> {
    @Override
    public PerformanceResult execute() {
        System.out.println("Executing normal driving strategy");
        return new PerformanceResult(80, 8);
    }
}
