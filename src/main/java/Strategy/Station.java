package Strategy;

public class Station {
    private StrategyPattern strategyRefuel;

    public Station (StrategyPattern strategyRefuel){
        this.strategyRefuel = strategyRefuel;
    }

    public void refuel(Car car, int range){
        this.strategyRefuel.refuel(car, range);
    }

}
