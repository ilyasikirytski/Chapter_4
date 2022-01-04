/*
Таксопарк. Определить иерархию легковых автомобилей.
Создать таксопарк. Подсчитать стоимость автопарка.
Провести сортировку автомобилей парка по расходу топлива.
Найти автомобиль в компании, соответствующий заданному диапазону параметров скорости.
 */

package B_10;

public class Main {
    public static void main(String[] args) {
        TaxiPark taxiPark = new TaxiPark();

        taxiPark.addCar(9, 10500, 90);
        taxiPark.addCar(8, 10500, 100);
        taxiPark.addCar(6, 10500, 110);
        taxiPark.addCar(7, 10500, 120);

        taxiPark.getParkValue();
        taxiPark.sortCarByFuelConsumption(8);
        taxiPark.findCarBySpeed(110);
    }
}
