package structural.strategy.genericstrategy.entities;

import structural.strategy.genericstrategy.inter.Strategy;

public class SportDrivingStrategy implements Strategy<PerformanceResult> {
    @Override
    public PerformanceResult execute() {
        System.out.println("Executing sport driving strategy");
        return new PerformanceResult(150, 15);
    }
}
