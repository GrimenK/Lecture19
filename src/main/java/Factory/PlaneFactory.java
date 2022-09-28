package Factory;

public class PlaneFactory {

    public Plane getPlane(String planeType){
        if(planeType == null){
            return null;
        }
        else if(planeType.equalsIgnoreCase("Jet Plane")){
            return new JetPlane();
        }
        else if (planeType.equalsIgnoreCase("Civil Plane")){
            return new CivilAircraft();
        }
        return null;
    }
}
