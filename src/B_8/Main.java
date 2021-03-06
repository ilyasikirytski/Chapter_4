/*
Транспорт. Определить иерархию подвижного состава железнодорожного
транспорта. Создать пассажирский поезд. Подсчитать общую численность
пассажиров и багажа. Провести сортировку вагонов поезда на основе уровня комфортности.
Найти в поезде вагоны, соответствующие заданному диапазону параметров числа пассажиров.
 */

package B_8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        PassengerTrain passengerTrain = new PassengerTrain();
        CargoTrain cargoTrain = new CargoTrain();
        passengerTrain.addVagons(new RailwayCarriege(3, 2));
        passengerTrain.addVagons(new RailwayCarriege(1, 4));
        passengerTrain.addVagons(new RailwayCarriege(2, 1));
        cargoTrain.addVagons(new RailwayCarriege(3, 3, 50));
        cargoTrain.addVagons(new RailwayCarriege(1, 8, 40));
        cargoTrain.addVagons(new RailwayCarriege(2, 1, 34));
//        passengerTrain.sortVagonsByComfort();
//        cargoTrain.sortVagonsByComfort();
//        passengerTrain.sortVagonsByPassengersCapacity();
//        cargoTrain.sortVagonsByPassengersCapacity();
        cargoTrain.sortVagonsBy(TypesOfSort.COMFORT_LEVEL);
        cargoTrain.sortVagonsBy(TypesOfSort.PASSENGERS_CAPACITY);
        passengerTrain.printTotalCountOfPassengers();
        cargoTrain.printTotalCountOfPassengers();

//        ArrayList<Train> listOfTrains = new ArrayList<>();
//        listOfTrains.add(passengerTrain);
//        listOfTrains.add(cargoTrain);
//        Generic generic = new Generic();
//        System.out.println("Generic_1 - Общая численность пассажиров всех поездов " + generic.sumOfBaggage(listOfTrains));
//
//        generic.sumOfBaggage2(listOfTrains);
    }
}

