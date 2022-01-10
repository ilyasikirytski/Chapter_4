package A_2;

import java.util.ArrayList;

public class Auto {
    private final String brand;
    private final ArrayList<Wheel> wheels;
    private final Engine engine;
    private int countOfFuel;

    public Auto(String brand, ArrayList<Wheel> wheels, Engine engine, int countOfFuel) {
        this.brand = brand;
        this.wheels = wheels;
        this.engine = engine;
        this.countOfFuel = countOfFuel;
    }

    public void drive() {
        if (countOfFuel <= 0) {
            System.out.println("Нужно заправиться");
        } else {
            countOfFuel -= 20;
            System.out.println(brand + " едет! - Потрачено 20% топлива! Остаток в баке: " + countOfFuel);
        }
    }

    public void refuel() {
        countOfFuel = 100;
        System.out.println("Машина успешно заправлена!");
    }

    public void checkWheels() {
        for (int i = 0; i < wheels.size(); i++) {
            System.out.println("Колесо " + (i + 1) + " размер: " + wheels.get(i).getSize());
        }
    }

    public void changeWheel(Wheel w, int index) {
        wheels.set(index, w);
        System.out.println("Колесо поменяно!");
    }

    public void getCarInfo() {
        System.out.printf("Марка авто: %s%n" +
                "Мощность: %s%n" +
                "Объём бака: %s%n", brand, engine.getHorsePower(), countOfFuel);
    }
}
