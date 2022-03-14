/*
Таксопарк. Определить иерархию легковых автомобилей.
Создать таксопарк. Подсчитать стоимость автопарка.
Провести сортировку автомобилей парка по расходу топлива.
Найти автомобиль в компании, соответствующий заданному диапазону параметров скорости.
 */

package Kot_B_10

fun main() {

    val mersedes = KotCarMersedes(9, 10500, 90)
    val bmw = KotCarBMW(8, 10500, 100)
    val mersedes1 = KotCarMersedes(6, 10500, 110)
    val bmw1 = KotCarBMW(7, 10500, 120)
    val taxiPark = KotTaxiPark()

    taxiPark.run {
        addCar(mersedes)
        addCar(bmw)
        addCar(mersedes1)
        addCar(bmw1)
        getParkValue()
        sortCarByFuelConsumption()
        findCarBySpeed(110, 120)
    }
}