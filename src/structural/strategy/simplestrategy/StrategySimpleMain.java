package structural.strategy.simplestrategy;

import structural.strategy.simplestrategy.entities.EconomyDriving;
import structural.strategy.simplestrategy.entities.NormalDriving;
import structural.strategy.simplestrategy.entities.SportDriving;
import structural.strategy.simplestrategy.entities.Vehicle;

public class StrategySimpleMain {
    public static void main(String[] args) {
        // Criando um veículo
        Vehicle car = new Vehicle("Honda Civic");

        // Usando estratégia de direção normal
        car.setDrivingStrategy(new NormalDriving());
        car.performDrive();

        System.out.println();

        // Mudando para estratégia de direção esportiva
        car.setDrivingStrategy(new SportDriving());
        car.performDrive();

        System.out.println();

        // Mudando para estratégia de direção econômica
        car.setDrivingStrategy(new EconomyDriving());
        car.performDrive();
    }
}
