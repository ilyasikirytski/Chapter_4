package B_8;

public class RailwayCarriege {
    private int comfortLevel;
    private int passengersCapacity;

    public RailwayCarriege(int comfortLevel, int passengersCapacity) {
        this.comfortLevel = comfortLevel;
        this.passengersCapacity = passengersCapacity;
    }

    public int getComfortLevel() {
        return comfortLevel;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    @Override
    public String toString() {
        return "RailwayCarriege{" +
                "comfortLevel=" + comfortLevel +
                ", passengersCapacity=" + passengersCapacity +
                '}';
    }
}
