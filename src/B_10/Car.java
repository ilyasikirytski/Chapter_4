package B_10;

public class Car {
    private int fuelConsumption;
    private int carPrice;
    private int maxSpeed;

    public Car(int fuelConsumption, int carPrice, int maxSpeed) {
        this.fuelConsumption = fuelConsumption;
        this.carPrice = carPrice;
        this.maxSpeed = maxSpeed;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuelConsumption=" + fuelConsumption +
                ", carPrice=" + carPrice +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
