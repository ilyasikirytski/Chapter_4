package Kot_B_10

// TOD зачем скобки фигурные `}`? лучше написать каждый параметр с новой строки
abstract class KotCar(var fuelConsumption: Int, var carPrice: Int, var maxSpeed: Int) : Comparable<KotCar> {
}