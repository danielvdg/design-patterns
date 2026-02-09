package structural.strategy.genericstrategy;

import structural.strategy.genericstrategy.entities.EconomyDrivingStrategy;
import structural.strategy.genericstrategy.entities.NormalDrivingStrategy;
import structural.strategy.genericstrategy.entities.PerformanceResult;
import structural.strategy.genericstrategy.entities.SportDrivingStrategy;
import structural.strategy.genericstrategy.strategy.Vehicle;

public class StrategyGenericMain {
    public static void main(String[] args) {
        // Criando um veículo com tipo genérico PerformanceResult
        Vehicle<PerformanceResult> car = new Vehicle<>("Toyota Camry");

        // Usando estratégia normal e obtendo resultado tipado
        car.setStrategy(new NormalDrivingStrategy());
        PerformanceResult result1 = car.performAction();
        System.out.println("Result: " + result1);

        System.out.println("\n---\n");

        // Mudando para estratégia esportiva
        car.setStrategy(new SportDrivingStrategy());
        PerformanceResult result2 = car.performAction();
        System.out.println("Result: " + result2);

        System.out.println("\n---\n");

        // Mudando para estratégia econômica
        car.setStrategy(new EconomyDrivingStrategy());
        PerformanceResult result3 = car.performAction();
        System.out.println("Result: " + result3);
    }
}
