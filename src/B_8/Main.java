/*
Транспорт. Определить иерархию подвижного состава железнодорожного
транспорта. Создать пассажирский поезд. Подсчитать общую численность
пассажиров и багажа. Провести сортировку вагонов поезда на основе уровня комфортности.
Найти в поезде вагоны, соответствующие заданному диапазону параметров числа пассажиров.
 */

package B_8;

public class Main {
    public static void main(String[] args) {
        PassengerTrain passengerTrain = new PassengerTrain();
        CargoTrain cargoTrain = new CargoTrain();
        passengerTrain.addVagons(new RailwayCarriege(3, 1));
        passengerTrain.addVagons(new RailwayCarriege(2, 2));
        passengerTrain.addVagons(new RailwayCarriege(1, 3));
        cargoTrain.addVagons(new RailwayCarriege(3, 1, 50));
        cargoTrain.addVagons(new RailwayCarriege(2, 2, 40));
        cargoTrain.addVagons(new RailwayCarriege(1, 3, 30));
        passengerTrain.sortVagonsByComfort();
        cargoTrain.sortVagonsByComfort();
        passengerTrain.sortVagonsByPassengersCapacity();
        cargoTrain.sortVagonsByPassengersCapacity();
        passengerTrain.getTotalCountOfPassengers();
        cargoTrain.getTotalCountOfPassengers();
    }
}

