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
        CarMersedes mersedes = new CarMersedes(9, 10500, 90);
        CarBMW bmw = new CarBMW(8, 10500, 100);
        CarMersedes mersedes1 = new CarMersedes(6, 10500, 110);
        CarBMW bmw1 = new CarBMW(7, 10500, 120);

        taxiPark.addCar(mersedes);
        taxiPark.addCar(bmw);
        taxiPark.addCar(mersedes1);
        taxiPark.addCar(bmw1);

        taxiPark.getParkValue();
        taxiPark.sortCarByFuelConsumption();
        taxiPark.findCarBySpeed(110, 120);
    }
}
