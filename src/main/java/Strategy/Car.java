package Strategy;

public class Car {
    private String type;
    private int range;

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", range=" + range +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public Car() {
    }
}
