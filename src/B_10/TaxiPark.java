package B_10;

import java.util.ArrayList;

public class TaxiPark{
    private int parkValue;
    private ArrayList<Car> cars = new ArrayList<>();

    public void addCar(int fuelConsumption, int carPrice, int maxSpeed){
        cars.add(new Car(fuelConsumption, carPrice, maxSpeed));
    }

    public void getParkValue(){
        for (Car c : cars){
            parkValue += c.getCarPrice();
        }
        System.out.println("Стоимость таксопарка составляет = " + parkValue + " долларов");
    }

    public void sortCarByFuelConsumption(int fuelConsumption){
        System.out.printf("Авто подпадающие под указанный расход - %n");
        for (Car c : cars){
            if (c.getFuelConsumption() == fuelConsumption)
                System.out.println(c);
        }
    }

    public void findCarBySpeed(int speed){
        System.out.printf("%nАвто подпадающие под указанную скорость :%n");
        for (Car c : cars){
            if (c.getMaxSpeed() == speed)
                System.out.println(c);
        }
    }
}
