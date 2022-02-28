package B_8;

public class RailwayCarriege implements Comparable<RailwayCarriege> {
    private final int comfortLevel;
    private final int passengersCapacity;
    private int countOfBaggage;

    public RailwayCarriege(int comfortLevel, int passengersCapacity) {
        this.comfortLevel = comfortLevel;
        this.passengersCapacity = passengersCapacity;
    }

    public RailwayCarriege(int comfortLevel, int passengersCapacity, int countOfBaggage) {
        this.comfortLevel = comfortLevel;
        this.passengersCapacity = passengersCapacity;
        this.countOfBaggage = countOfBaggage;
    }

    public int getComfortLevel() {
        return comfortLevel;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    public int getCountOfBaggage() {
        return countOfBaggage;
    }

    @Override
    public String toString() {
        return "RailwayCarriage{" +
                "comfortLevel=" + comfortLevel +
                ", passengersCapacity=" + passengersCapacity +
                '}';
    }

    @Override
    public int compareTo(RailwayCarriege o) {
        return (getComfortLevel() - o.getComfortLevel());
    }
}
