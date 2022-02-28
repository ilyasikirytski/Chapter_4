package Kot_B_10;

public class KotCarBMW extends KotCar{
    public KotCarBMW(int fuelConsumption, int carPrice, int maxSpeed) {
        super(fuelConsumption, carPrice, maxSpeed);
    }

    @Override
    public int compareTo(KotCar o) {
        return (getFuelConsumption() - o.getFuelConsumption());
    }

    @Override
    public String toString() {
        return "KotCarBMW {" +
                "fuelConsumption=" + getFuelConsumption() +
                ", carPrice=" + getCarPrice() +
                ", maxSpeed=" + getMaxSpeed() +
                '}';
    }
}
