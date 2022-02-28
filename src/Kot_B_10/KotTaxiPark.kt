package Kot_B_10

class KotTaxiPark {
    // TOD почему public?
    private var arrayCar: ArrayList<KotCar> = ArrayList()

    // TOD можно заменить на - parkValue = arrayCar.sumOf { kotCar: KotCar -> kotCar.carPrice }
    //  или даже на - parkValue = arrayCar.sumOf(KotCar::carPrice)
    fun getParkValue() = println("KOT Стоимость таксопарка составляет = ${arrayCar.sumOf { it.carPrice }} долларов")

    // TOD - тоже что и в цветах, создаешь объект прямо в методе
    //  - можно заменить на arrayCar += KotCar

    fun addCar(kotCar: KotCar) {
        arrayCar += kotCar
    }

    // TOD можно заменить на
    //  - arrayCar.filter { it.fuelConsumption == fuelConsumption }
    //            .forEach(::println)
    //  - или на arrayCar.filter { it.fuelConsumption == fuelConsumption }
    //                  .forEach { println(it) }
    fun sortCarByFuelConsumption() {
        println("KOT Авто подпадающие под указанный расход - ")
        arrayCar.sort()
        for (c in arrayCar) {
            println(c)
        }
    }

    fun findCarBySpeed(speed1: Int, speed2 : Int) {
        println("KOT  Авто подпадающие под указанную скорость :")
        for (c in arrayCar) {
            if (c.maxSpeed in speed1..speed2) println(c)
        }
    }
}