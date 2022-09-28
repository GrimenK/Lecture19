package Strategy;

public class ElectricChargingStrategy implements StrategyPattern {

    @Override
    public void refuel(Car car, int range) {
        System.out.println("This is e-car, a charging is required");
        System.out.println("Charging the car...");
        car.setRange(car.getRange() + range);
        System.out.println("Finished. Now range is: " + car.getRange());
    }

    @Override
    public void printInfo() {
        System.out.println("This is charging station for electric cars.");
    }
}
