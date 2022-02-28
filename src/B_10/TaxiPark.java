package B_10;

import java.util.ArrayList;
import java.util.Collections;

public class TaxiPark {
    private ArrayList<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void getParkValue() {
        int parkValue = 0;
        for (Car c : cars) {
            parkValue += c.getCarPrice();
        }
        System.out.println("Стоимость таксопарка составляет = " + parkValue + " долларов");
    }

    public void sortCarByFuelConsumption() {
        System.out.printf("Авто отсортированные по расходу - %n");
        Collections.sort(cars);
        for (Car c : cars) {
            System.out.println(c);
        }
    }

    public void findCarBySpeed(int speed1, int speed2) {
        System.out.printf("%nАвто подпадающие под указанную скорость :%n");
        for (Car c : cars) {
            if (c.getMaxSpeed() >= speed1 && c.getMaxSpeed() <= speed2)
                System.out.println(c);
        }
    }
}
