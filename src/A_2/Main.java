/*
Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */

package A_2;

// TODO форматирование кода (пробелы, запятые и тд)
// TODO добавить наследование
public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("Ford", 2, false);
        auto.printBrand();
        auto.drive();
        auto.changeWheel();
        auto.engine.isRefueling();
    }
}
