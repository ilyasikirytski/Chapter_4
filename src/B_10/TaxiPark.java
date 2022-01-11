package B_10;

import java.util.ArrayList;

public class TaxiPark {
    private int parkValue;
    private ArrayList<Car> cars = new ArrayList<>();

    // TODO - опять же как и в цветах, добавляешь машину а не ее параметры
    public void addCar(int fuelConsumption, int carPrice, int maxSpeed) {
        cars.add(new Car(fuelConsumption, carPrice, maxSpeed));
    }

    // TODO - почему parkValue как параметр класса? а что если несколько раз вызову этот метод? проверь)
    public void getParkValue() {
        for (Car c : cars) {
            parkValue += c.getCarPrice();
        }
        System.out.println("Стоимость таксопарка составляет = " + parkValue + " долларов");
    }

    // TODO должна быть или сортировка внутри или другое название метода
    public void sortCarByFuelConsumption(int fuelConsumption) {
        System.out.printf("Авто подпадающие под указанный расход - %n");
        for (Car c : cars) {
            if (c.getFuelConsumption() == fuelConsumption)
                System.out.println(c);
        }
    }

    public void findCarBySpeed(int speed) {
        System.out.printf("%nАвто подпадающие под указанную скорость :%n");
        for (Car c : cars) {
            if (c.getMaxSpeed() == speed)
                System.out.println(c);
        }
    }
}
