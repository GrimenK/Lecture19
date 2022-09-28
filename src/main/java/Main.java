import Strategy.Car;
import Strategy.ElectricChargingStrategy;
import Strategy.GasRefuelStrategy;

public class Main {

    public static void main(String[] args) {
        Singleton singletonObject = Singleton.getInstance();

        Car electricCar = new Car();
        Car genericCar = new Car();

        singletonObject.carStationRefuelStrategy(new ElectricChargingStrategy(),electricCar, 200);
        singletonObject.carStationRefuelStrategy(new GasRefuelStrategy(),genericCar, 200);


        singletonObject.flySomePlane("Jet Plane");
        singletonObject.flySomePlane("Civil Plane");

    }
}
