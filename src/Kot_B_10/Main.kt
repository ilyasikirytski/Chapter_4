/*
Таксопарк. Определить иерархию легковых автомобилей.
Создать таксопарк. Подсчитать стоимость автопарка.
Провести сортировку автомобилей парка по расходу топлива.
Найти автомобиль в компании, соответствующий заданному диапазону параметров скорости.
 */

package Kot_B_10

import B_10.CarBMW
import B_10.CarMersedes

fun main() {
    val taxiPark = KotTaxiPark()

    val mersedes = KotCarMersedes(9, 10500, 90)
    val bmw = KotCarBMW(8, 10500, 100)
    val mersedes1 = KotCarMersedes(6, 10500, 110)
    val bmw1 = KotCarBMW(7, 10500, 120)

    taxiPark.addCar(mersedes)
    taxiPark.addCar(bmw)
    taxiPark.addCar(mersedes1)
    taxiPark.addCar(bmw1)

    taxiPark.getParkValue()
    taxiPark.sortCarByFuelConsumption()
    taxiPark.findCarBySpeed(110, 120)
}