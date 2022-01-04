package B_8;

public class Vagons {
    private int comfortLevel;
    private int passengersCapacity;

    public Vagons(int comfortLevel, int passengersCapacity) {
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
        return "Vagons{" +
                "comfortLevel=" + comfortLevel +
                ", passengersCapacity=" + passengersCapacity +
                '}';
    }
}
