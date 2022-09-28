package Strategy;

public class GasRefuelStrategy implements StrategyPattern {

    @Override
    public void refuel(Car car, int range) {
        System.out.println("This is generic car, refill is required");
        System.out.println("Refilling the gas tank...");
        car.setRange(car.getRange() + range);
        System.out.println("Finished. Now range is: " + car.getRange());
    }

    @Override
    public void printInfo() {
        System.out.println("This is generic gas station for diesel and gas vehicles");
    }
}
