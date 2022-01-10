/*
Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */

package A_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Wheel> wheels = new ArrayList<>();
        wheels.add(new Wheel(16));
        wheels.add(new Wheel(15));
        wheels.add(new Wheel(16));
        wheels.add(new Wheel(15));

        Engine engine = new Engine(150);
        Auto car = new Auto("Ford", wheels, engine, 20);
        car.drive();
        car.drive();
        car.refuel();
        car.checkWheels();
        car.changeWheel(new Wheel(16), 3);
        car.checkWheels();
        car.getCarInfo();
    }
}
