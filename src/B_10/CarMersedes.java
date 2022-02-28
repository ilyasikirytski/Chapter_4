package B_10;

public class CarMersedes extends Car {
    public CarMersedes(int fuelConsumption, int carPrice, int maxSpeed) {
        super(fuelConsumption, carPrice, maxSpeed);
    }

    @Override
    public String toString() {
        return "CarMersedes{" +
                "fuelConsumption=" + getFuelConsumption() +
                ", carPrice=" + getCarPrice() +
                ", maxSpeed=" + getMaxSpeed() +
                '}';
    }
}
