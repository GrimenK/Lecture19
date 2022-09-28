package Factory;

public class JetPlane implements Plane {
    @Override
    public void fly() {
        System.out.println("This is jet pane, max speed is 2500 km/h");
    }
}
