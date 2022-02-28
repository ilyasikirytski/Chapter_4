package B_10;

public class CarBMW extends Car {
    public CarBMW(int fuelConsumption, int carPrice, int maxSpeed) {
        super(fuelConsumption, carPrice, maxSpeed);
    }

    @Override
    public String toString() {
        return "CarBMW{" +
                "fuelConsumption=" + getFuelConsumption() +
                ", carPrice=" + getCarPrice() +
                ", maxSpeed=" + getMaxSpeed() +
                '}';
    }
}
