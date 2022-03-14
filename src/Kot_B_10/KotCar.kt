package Kot_B_10

abstract class KotCar(
    open var fuelConsumption: Int,
    open var carPrice: Int,
    open var maxSpeed: Int
) : Comparable<KotCar>