package Kot_B_10

class KotTaxiPark {
    // TODO почему public?
    var parkValue = 0
    var arrayCar: ArrayList<KotCar> = ArrayList()

    // TODO можно заменить на - parkValue = arrayCar.sumOf { kotCar: KotCar -> kotCar.carPrice }
    //  или даже на - parkValue = arrayCar.sumOf(KotCar::carPrice)
    fun getParkValue() {
        for (c in arrayCar) {
            // TODO оператор `+=` ?
            parkValue = parkValue + c.carPrice
        }
        println("KOT Стоимость таксопарка составляет = $parkValue долларов")
    }

    // TODO - тоже что и в цветах, создаешь объект прямо в методе
    //  - можно заменить на arrayCar += KotCar

    fun addCar(fuelConsumption: Int, carPrice: Int, maxSpeed: Int) {
        arrayCar += KotCar(fuelConsumption, carPrice, maxSpeed)
    }

    // TODO можно заменить на
    //  - arrayCar.filter { it.fuelConsumption == fuelConsumption }
    //            .forEach(::println)
    //  - или на arrayCar.filter { it.fuelConsumption == fuelConsumption }
    //                  .forEach { println(it) }
    fun sortCarByFuelConsumption(fuelConsumption: Int) {
        println("KOT Авто подпадающие под указанный расход - ")
        for (c in arrayCar) {
            if (c.fuelConsumption == fuelConsumption) println(c)
        }
    }

    fun findCarBySpeed(speed: Int) {
        println("KOT  Авто подпадающие под указанную скорость :")
        for (c in arrayCar) {
            if (c.maxSpeed == speed) println(c)
        }
    }
}