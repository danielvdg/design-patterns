package structural.strategy.genericstrategy.strategy;

import structural.strategy.genericstrategy.inter.Strategy;

// Context genérico - Classe que usa a estratégia com tipo genérico
public class Vehicle <T> {
    private String model;
    private Strategy<T> strategy;

    public Vehicle(String model) {
        this.model = model;
    }

    // Método para definir a estratégia
    public void setStrategy(Strategy<T> strategy) {
        this.strategy = strategy;
    }

    // Método que executa a estratégia e retorna o resultado tipado
    public T performAction() {
        System.out.println(model + " is performing action:");
        if (strategy != null) {
            return strategy.execute();
        }
        return null;
    }

}
