package B_8;

import java.util.ArrayList;

public class RailwayTransport {
    private ArrayList<PassengerTrain> passengerTrains = new ArrayList<>();
    private ArrayList<CargoTrain> cargoTrains = new ArrayList<>();
    private ArrayList<Vagons> vagons = new ArrayList<>();

    public RailwayTransport() {
    }

    public void addTrain(int countOfVagon, int comfortLevel, int countOfPassengers, int countOfBaggage) {
        if (countOfPassengers > 20) {
            passengerTrains.add(new PassengerTrain(countOfVagon, comfortLevel, countOfPassengers, countOfBaggage));
        } else {
            cargoTrains.add(new CargoTrain(countOfVagon, comfortLevel, countOfPassengers, countOfBaggage));
        }
    }

    public void addVagons(int comfortLevel, int passengersCapacity){
        vagons.add(new Vagons(comfortLevel, passengersCapacity));
    }

    public void sortVagonsByPassengersCapacity(int capacity){
        System.out.printf("----------------------------------------%nВагоны подпадающие под указанную вместительность :%n");
        for (Vagons v : vagons) {
            if (v.getPassengersCapacity() == capacity) {
                System.out.println(v);
            }
        }
    }

    public void sortVagonsByComfort(int comfortLevel) {
        System.out.printf("----------------------------------------%nВагоны подпадающие под уровень комфорта :%n");
        for (Vagons v : vagons) {
            if (v.getComfortLevel() == comfortLevel) {
                System.out.println(v);
            }
        }
    }

    public void getTotalCountOfPassengers() {
        int totalCountOfPassengers = 0;
        for (PassengerTrain p : passengerTrains) {
            totalCountOfPassengers += p.getCountOfPassengers();
        }
        System.out.println("Общая чиссленность пассажиров пассажирских поездов - " + totalCountOfPassengers);
        int totalCountOfCargoPassengers = 0;
        for (CargoTrain c : cargoTrains) {
            totalCountOfCargoPassengers += c.getCountOfPassengers();
        }
        System.out.println("Общая чиссленность пассажиров грузовых поездов - " + totalCountOfCargoPassengers);
    }


    public void printAllTrains() {
        System.out.printf("----------------------------------------%nСписок всех добавленных поездов :%n");
        for (CargoTrain c : cargoTrains) {
            System.out.println(c);
        }
        for (PassengerTrain p : passengerTrains) {
            System.out.println(p);
        }
    }
}
