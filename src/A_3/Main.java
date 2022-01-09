/*
Создать объект класса Самолет, используя классы Крыло, Шасси,
Двигатель. Методы: летать, задавать маршрут, вывести на консоль маршрут.
 */

package A_3;

public class Main {
    public static void main(String[] args) {
        Chassis chassis = new Chassis("Колёсные");
        Engine engine = new Engine(1000);
        Wing wing = new Wing(65);

        Plane plane = new Plane(wing, engine, chassis);
        plane.fly();
        plane.setRoute("Маршрут: NY -> LA");
        plane.printRoute();
        plane.getPlaneInfo();
    }
}
