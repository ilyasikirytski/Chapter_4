/*
Создать объект класса Самолет, используя классы Крыло, Шасси,
Двигатель. Методы: летать, задавать маршрут, вывести на консоль маршрут.
 */

package A_3;

// TODO форматирование кода (пробелы, запятые и тд)
// TODO добавить наследование
public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(true, true, true);
        plane.fly();
        plane.setRoute("NY -> LA");
        plane.printRoute();
    }
}
