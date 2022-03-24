package Kot_B_10
/*
data класс не нужен или он должен быть похож как "kotCar"
 */
class KotTaxiPark() {
    private var arrayCar: ArrayList<KotCar> = ArrayList()

    fun getParkValue() = println("KOT Стоимость таксопарка составляет = ${arrayCar.sumOf { it.carPrice }} долларов")

    fun addCar(kotCar: KotCar) {
        arrayCar += kotCar
    }

    fun sortCarByFuelConsumption() {
        println("KOT Авто подпадающие под указанный расход - ")
        arrayCar.sort()
        for (c in arrayCar) {
            println(c)
        }
    }

    fun findCarBySpeed(speed1: Int, speed2: Int) {
        println("KOT  Авто подпадающие под указанную скорость :")
        for (c in arrayCar) {
            if (c.maxSpeed in speed1..speed2) println(c)
        }
    }
}