/*
Транспорт. Определить иерархию подвижного состава железнодорожного
транспорта. Создать пассажирский поезд. Подсчитать общую численность
пассажиров и багажа. Провести сортировку вагонов поезда на основе уровня комфортности.
Найти в поезде вагоны, соответствующие заданному диапазону параметров числа пассажиров.
 */

package B_8;

public class Main {
    public static void main(String[] args) {
        RailwayTransport railwayTransport = new RailwayTransport();

        railwayTransport.addTrain(2, 10, 50, 3);
        railwayTransport.addTrain(50, 2, 3, 3);
        railwayTransport.addTrain(5, 1, 60, 3);
        railwayTransport.addTrain(48, 9, 3, 3);

        railwayTransport.printAllTrains();
        railwayTransport.getTotalCountOfPassengers();

        railwayTransport.addVagons(3, 50);
        railwayTransport.addVagons(3, 50);
        railwayTransport.addVagons(3, 30);
        railwayTransport.addVagons(3, 60);
        railwayTransport.sortVagonsByPassengersCapacity(50);
        railwayTransport.sortVagonsByComfort(3);
    }
}

