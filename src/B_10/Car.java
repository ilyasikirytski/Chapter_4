package B_10;

abstract class Car implements Comparable<Car> {
    private final int fuelConsumption;
    private final int carPrice;
    private final int maxSpeed;

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
    public int compareTo(Car o) {
        return (getFuelConsumption() - o.getFuelConsumption());
    }
}
