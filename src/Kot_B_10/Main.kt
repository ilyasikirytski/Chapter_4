/*
Таксопарк. Определить иерархию легковых автомобилей.
Создать таксопарк. Подсчитать стоимость автопарка.
Провести сортировку автомобилей парка по расходу топлива.
Найти автомобиль в компании, соответствующий заданному диапазону параметров скорости.
 */

package Kot_B_10

fun main() {
    val taxiPark = KotTaxiPark()

    taxiPark.addCar(9, 10500, 90)
    taxiPark.addCar(8, 10500, 100)
    taxiPark.addCar(6, 10500, 110)
    taxiPark.addCar(7, 10500, 120)

    taxiPark.getParkValue()
    taxiPark.sortCarByFuelConsumption(8)
    taxiPark.findCarBySpeed(110)
}