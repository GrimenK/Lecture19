import Factory.Plane;
import Factory.PlaneFactory;
import Strategy.Car;
import Strategy.Station;
import Strategy.StrategyPattern;

public class Singleton {

    private static Singleton singletonInstance;


    private Singleton(){
    }

    public static Singleton getInstance(){
        if(singletonInstance == null){
           singletonInstance = new Singleton();
        }
       return singletonInstance;
    }


    public void carStationRefuelStrategy(StrategyPattern strategyPattern, Car car, int range){
        Station st = new Station(strategyPattern);
        st.refuel(car,range);
    }

    public void flySomePlane(String planeParam){
        PlaneFactory planeFactory = new PlaneFactory();
        Plane plane1 = planeFactory.getPlane(planeParam);
        plane1.fly();
    }

}
