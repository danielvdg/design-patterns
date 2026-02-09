package structural.strategy.genericstrategy.entities;

public class PerformanceResult {
    private int speed;
    private int fuelConsumption;

    public PerformanceResult(int speed, int fuelConsumption) {
        this.speed = speed;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return "Speed: " + speed + " km/h, Fuel Consumption: " + fuelConsumption + " L/100km";
    }
}
