package Kot_B_10

class KotTaxiPark {
    var parkValue = 0
    var arrayCar: ArrayList<KotCar> = ArrayList()

    fun getParkValue() {
        for (c in arrayCar) {
            parkValue = parkValue + c.carPrice
        }
        println("KOT Стоимость таксопарка составляет = $parkValue долларов")
    }

    fun addCar(fuelConsumption: Int, carPrice: Int, maxSpeed: Int) {
        arrayCar.add(KotCar(fuelConsumption, carPrice, maxSpeed))
    }

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