package Kot_B_10;

data class KotCarBMW(
    override var fuelConsumption: Int,
    override var carPrice: Int,
    override var maxSpeed: Int
) : KotCar(fuelConsumption, carPrice, maxSpeed) {
    override fun compareTo(other: KotCar): Int {
        return (fuelConsumption - other.fuelConsumption)
    }
}
