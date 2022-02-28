package Kot_B_10;

public class KotCarMersedes extends KotCar{
    public KotCarMersedes(int fuelConsumption, int carPrice, int maxSpeed) {
        super(fuelConsumption, carPrice, maxSpeed);
    }

    @Override
    public int compareTo(KotCar o) {
        return (getFuelConsumption() - o.getFuelConsumption());
    }

    @Override
    public String toString() {
        return "KotCarMersedes {" +
                "fuelConsumption=" + getFuelConsumption() +
                ", carPrice=" + getCarPrice() +
                ", maxSpeed=" + getMaxSpeed() +
                '}';
    }
}
